package com.github.binarywang.demo.wx.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.binarywang.demo.wx.mp.dao.RestaurantDao;
import com.github.binarywang.demo.wx.mp.entity.RestaurantEntity;
import com.github.binarywang.demo.wx.mp.service.TSnowBuRestaurantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;


/**
 * 餐厅表(TSnowBuRestaurant)表服务实现类
 *
 * @author makejava
 * @since 2023-12-22 17:18:30
 */
@Service("tSnowBuRestaurantService")
public class TSnowBuRestaurantServiceImpl extends ServiceImpl<RestaurantDao,RestaurantEntity> implements TSnowBuRestaurantService {

    @Resource
    RestaurantDao restaurantDao;

    @Override
    public String getRandomRestaurant() {
        LambdaQueryWrapper<RestaurantEntity> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.ne(RestaurantEntity::getLastChoose,1);
        List<RestaurantEntity> restaurantEntities = restaurantDao.selectList(queryWrapper);
        Random random = new Random();
        int randomIndex = random.nextInt(restaurantEntities.size());
        RestaurantEntity randomRestaurant = restaurantEntities.get(randomIndex);
        return randomRestaurant.getRestaurantName();
    }
}


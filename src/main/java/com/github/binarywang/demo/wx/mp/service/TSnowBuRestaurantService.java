package com.github.binarywang.demo.wx.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.binarywang.demo.wx.mp.entity.RestaurantEntity;

/**
 * 餐厅表(TSnowBuRestaurant)表服务接口
 *
 * @author makejava
 * @since 2023-12-22 17:18:20
 */
public interface TSnowBuRestaurantService extends IService<RestaurantEntity> {

    /***
     * @Description 获取随机的餐厅
     * @Author lisonghua
     * @Date 2023/12/22 17:31
     */
    String getRandomRestaurant();

}


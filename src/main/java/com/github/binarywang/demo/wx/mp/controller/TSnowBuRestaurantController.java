package com.github.binarywang.demo.wx.mp.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.binarywang.demo.wx.mp.entity.RestaurantEntity;
import com.github.binarywang.demo.wx.mp.service.TSnowBuRestaurantService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 餐厅表(TSnowBuRestaurant)表控制层
 *
 * @author makejava
 * @since 2023-12-22 17:18:07
 */
@RestController
@RequestMapping("tSnowBuRestaurant")
public class TSnowBuRestaurantController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TSnowBuRestaurantService tSnowBuRestaurantService;

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param tSnowBuRestaurant 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RestaurantEntity> page, RestaurantEntity tSnowBuRestaurant) {
        return success(this.tSnowBuRestaurantService.page(page, new QueryWrapper<>(tSnowBuRestaurant)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tSnowBuRestaurantService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tSnowBuRestaurant 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RestaurantEntity tSnowBuRestaurant) {
        return success(this.tSnowBuRestaurantService.save(tSnowBuRestaurant));
    }

    /**
     * 修改数据
     *
     * @param tSnowBuRestaurant 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RestaurantEntity tSnowBuRestaurant) {
        return success(this.tSnowBuRestaurantService.updateById(tSnowBuRestaurant));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tSnowBuRestaurantService.removeByIds(idList));
    }
}


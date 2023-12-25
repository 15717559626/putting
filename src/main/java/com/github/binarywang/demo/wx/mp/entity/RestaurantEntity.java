package com.github.binarywang.demo.wx.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description
 * @Author lisonghua
 * @Date 2023/12/22 16:55
 **/
@TableName(value = "t_snow_bu_restaurant")
@Data
public class RestaurantEntity {

    private Long restaurantId;

    private String restaurantName;

    private Integer lastChoose;
}

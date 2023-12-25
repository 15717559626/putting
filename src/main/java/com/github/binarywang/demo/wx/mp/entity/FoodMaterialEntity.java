package com.github.binarywang.demo.wx.mp.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Description
 * @Author lisonghua
 * @Date 2023/12/22 16:58
 **/
@TableName(value = "t_snow_bu_food_material")
public class FoodMaterialEntity {

    @TableId()
    private String materialId;

    private String name;


}

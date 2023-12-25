package com.github.binarywang.demo.wx.mp.entity.param;

import lombok.Data;

/**
 * @Description
 * @Author lisonghua
 * @Date 2023/12/22 15:37
 **/
@Data
public class UserMsgParam {

    private String openid;

    private String msg;

    private String msgType;

    private String content;



}

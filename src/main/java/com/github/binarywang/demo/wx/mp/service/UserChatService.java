package com.github.binarywang.demo.wx.mp.service;

import com.github.binarywang.demo.wx.mp.entity.param.UserMsgParam;

/**
 * @Description
 * @Author lisonghua
 * @Date 2023/12/22 15:33
 **/
public interface UserChatService {

    void saveMsg(UserMsgParam userMsgParam);
}

package com.ubisys.springbootdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ubisys.springbootDubbo.Service.TicketService;

import java.security.PrivateKey;

/**
 * Created by cw on 2018/7/26.
 */
public interface UserService {


    public String getTicket(String username);


}

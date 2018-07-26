package com.ubisys.springbootdubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ubisys.springbootDubbo.Service.TicketService;
import org.springframework.stereotype.Service;

/**
 * Created by cw on 2018/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    private TicketService ticketService;

    @Override
    public String getTicket(String username) {
        return " people " + username + " 买到了电影票 " + ticketService.getTicket();
    }
}

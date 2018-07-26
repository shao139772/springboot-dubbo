package com.ubisys.springbootdubbo.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ubisys.springbootDubbo.Service.TicketService;
import org.springframework.stereotype.Component;

/**
 * Created by cw on 2018/7/25.
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《复仇者联盟3》";
    }
}

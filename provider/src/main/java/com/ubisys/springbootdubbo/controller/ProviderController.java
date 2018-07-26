package com.ubisys.springbootdubbo.controller;

import com.ubisys.springbootDubbo.Service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cw on 2018/7/25.
 */
@RestController
public class ProviderController {


    private Logger loggger = LoggerFactory.getLogger(ProviderController.class);

    @Autowired
    private TicketService ticketService;

    @GetMapping("/buy")
    public Map getTicket(String name) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("name", name);
        String filmName = ticketService.getTicket();
        result.put("ticket", filmName);

        return result;
    }


}

package com.ubisys.springbootdubbo.controller;

import com.ubisys.springbootdubbo.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cw on 2018/7/26.
 */
@RestController
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;


    /**
     * 新增一个注释
     *
     * @param name
     * @return
     */
    @GetMapping("/userBuy")
    public Map<String, String> buyTicket(String name) {

        Map<String, String> result = new HashMap<String, String>();

        result.put("name", name);
        result.put("result", userService.getTicket(name));
        log.info(result.toString());
        return result;
    }


}

package com.hjay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: 南迪叶先生:https://www.cnblogs.com/ye888/
 * @Date: 2019/10/12
 * @Description: com.yrp.controller
 * @version: 1.0
 */
@Controller
public class AboutShowController {
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

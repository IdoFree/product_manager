package com.ido.demo.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ido on 2017/7/11.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @ResponseBody
    @GetMapping("index")
    public String index(){
        return "home page";
    }

    @GetMapping("home")
    public String page(){
        return "home";
    }

}

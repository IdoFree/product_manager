package com.ido.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/11.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @ResponseBody
    @GetMapping("index")
    public String index(){
        return "home";
    }


    @GetMapping("home")
    public String home(){
        return "sale_records";
    }
}

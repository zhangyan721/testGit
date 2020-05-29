package com.springboot.chartep2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;//只会在页面返回return的值，不会跳转到具体的页面

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String Index (){

        return "index";
    }

}

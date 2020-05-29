package com.springboot.chartep2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {



    /**
     * 测试类请求
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public Map<String , String>test(){
        Map<String , String> map = new HashMap<>();
        map.put("key1","value1");
        return map;
    }

}

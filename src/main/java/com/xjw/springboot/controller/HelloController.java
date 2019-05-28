package com.xjw.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello ";
    }

    @RequestMapping("/success")
    public String success(){
        //加入了thymeleaf后，意为  classpath:/templates/success.html
        return "success";
    }

    //示例：查一些数据，在页面显示
    @RequestMapping("/query")
    public String query(Map<String, Object> map){
        map.put("hello", "<h1>你好</h1>");
        map.put("names", Arrays.asList("zhangsan", "lisi", "zhaoliu"));
        return "queryResult";
    }
}

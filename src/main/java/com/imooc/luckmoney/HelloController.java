package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @author xxm
 * @version 1.0
 * @date 2019/4/17 0:23
 *
 * @Controller + @ResponseBody = @RestController
 */
//@RestController
    @Controller
//    @ResponseBody
    @RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfiguration limitConfiguration;

    //新版写法
//    @GetMapping({"/hello","/hi"})
//    @GetMapping("/hello/say")
//    @GetMapping("/say")
//    @PostMapping("/say")
    @RequestMapping("/say")
//    @GetMapping("/say/{id}")
    @ResponseBody
//    public String say(@PathVariable("id") Integer id){
//    public String say(@RequestParam("id") Integer myId){
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
//        return "新版Springboot来袭！！";
//        return "minMoney:"+minMoney+"说明:"+description;
//        return "说明："+limitConfiguration.getDescription();
//        return "index";
//        return "id:"+ id;
        return "myId:"+ myId;
    }
}

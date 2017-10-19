package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

//    //获取yml配置文件中的属性
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;

    //将配置文件中的属性映射到类中
    @Autowired
    GirlProperties girlProperties;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public  String say(){
        return girlProperties.getCupSize()+ " " + girlProperties.getAge();
    }
}

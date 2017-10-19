package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//     @PathVariable的请求路径为http://localhost:8080/hello/23
//    @RequestMapping(value ={ "/hello/{id}"},method = RequestMethod.GET)
//    public  String say(@PathVariable(value = "id")Integer id){

//    RequestParam的请求路径为http://localhost:8080/hello?id=23，此时默认值位12
    @RequestMapping(value ={ "/hello"},method = RequestMethod.GET)
    public  String say(@RequestParam(value = "id",defaultValue = "12")Integer id){
        return girlProperties.getCupSize()+ " " + girlProperties.getAge() + " "+ id;

    }
}

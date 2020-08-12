package com.roiocam.app.controller;

import com.roiocam.app.entity.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy Chen
 * @date 8/13/20 3:51 AM
 */
@RestController
public class HelloWorldController {
    /**
     * 这里依赖了common项目的HelloWorld类
     * @return
     */
    @GetMapping(value = "/hello")
    public String helloWorld(){
        HelloWorld result = new HelloWorld();
        return result.toString();
    }
}

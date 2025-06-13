package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.DemoResponse;

@RestController
public class DemoController { 

    @GetMapping("/demo")
    private DemoResponse display(){
          return new DemoResponse("HelloWorld! 出力!", "Japanese");
    }
}
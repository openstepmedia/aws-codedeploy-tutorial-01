package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
    @RequestMapping("/")
    public String hello() 
    {
        // LocalDate today = LocalDate.now();
        return "<h1> Congratulations. Inside HelloWorldController. time:4:30pm  - Hi Argenis and Oswell!</h1>";
    }
}

package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoController
{
    private final DemoService demoService;

    public DemoController(DemoService demoService)
    {
        this.demoService = demoService;
    }

    public int randomNumber()
    {
        return demoService.randomNumber();
    }
}

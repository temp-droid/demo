package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService
{
    // Implementation following https://xkcd.com/221/
    public int randomNumber()
    {
        return 4;
    }
}

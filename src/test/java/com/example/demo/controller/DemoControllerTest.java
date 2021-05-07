package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DemoControllerTest
{
    private static final int RANDOM = 4;

    @Autowired
    private DemoController controller;

    @Test
    void randomNumber_is_random()
    {
        // when
        int randomNumber = controller.randomNumber();
        // then
        assertThat(randomNumber, is(RANDOM));
    }
}

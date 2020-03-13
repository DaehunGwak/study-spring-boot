package com.daehun.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(
        properties = {
                "property.value=propertyTest"
        },
        classes = {TestApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class TestApplicationTest {

    @Value("${value}")
    private String value;

    @Value("${property.value}")
    private String propertyValue;

    @Test
    public void contextLoads(){
        assertThat(value, is("test"));
        assertThat(propertyValue, is("propertyTest"));
    }
}
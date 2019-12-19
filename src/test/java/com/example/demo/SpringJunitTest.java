package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJunitTest {
    @Test
    public void dotest() {
        SpringJunit springJunit = new SpringJunit();
        int res = springJunit.add(11, 22);
        Assert.assertEquals(res,33);
    }
}

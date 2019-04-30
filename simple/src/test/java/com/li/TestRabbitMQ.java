package com.li;

import com.li.bean.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes=App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        for (int i=0;i<100;i++){
            helloSender.send(i);
        }
    }
}
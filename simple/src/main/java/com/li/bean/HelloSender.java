package com.li.bean;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send(int index) {
//        template.convertAndSend("mm","hello,rabbit~");
        template.convertAndSend("exchange","topic.messages","hello，Topic转发模式。。。"+index);
    }
}
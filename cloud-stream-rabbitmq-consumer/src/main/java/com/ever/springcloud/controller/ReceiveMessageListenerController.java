package com.ever.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/49:08
 */
@EnableBinding(Sink.class)
@Component
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    public void input(Message<String> message){
        System.out.println("消费者1号----->接收到的消息 : " + message.getPayload() + ",serverport : " + serverPort);
    }

}

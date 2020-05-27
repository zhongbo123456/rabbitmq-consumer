package com.example.rabbitmqconsumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @BelongProjecet rabbitmq-consumer
 * @BelongPackage com.example.rabbitmqconsumer.listener
 * @Description:
 * @Author: zhongbo
 * @Date: 2020/5/27 13:34
 */
@Component
@RabbitListener(queues = "topic.woman")
public class TopicTotalReceiver {
    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("TopicTotalReceiver消费者接收消息"+testMessage.toString());
    }
}

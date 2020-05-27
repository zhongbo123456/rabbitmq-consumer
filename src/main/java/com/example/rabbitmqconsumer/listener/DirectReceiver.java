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
 * @Date: 2020/5/27 11:09
 */
@Component
/**
 * 监听队列的名字
 */
@RabbitListener(queues ="TestDirectQueue")
public class DirectReceiver {
    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("DirectReceive消费者收到消息："+testMessage.toString());
    }

}

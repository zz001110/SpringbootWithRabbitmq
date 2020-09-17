package com.testrabbitmq.fanout;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zizi
 * @Version
 * @Description
 * @Date 2020/9/10 10:11
 */
@Component
public class FanOutCustorme {

    //消费者1
    //绑定交换机
    @RabbitListener(bindings = {@QueueBinding(value = @Queue,//临时队列
            exchange = @Exchange(value = "logs",type = "fanout"))})
    public void recevie1(String message) {
        System.out.println("message1=" + message);
    }

    //绑定交换机
    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "logs",type = "fanout"))})
    public void recevie2(String message) {
        System.out.println("message2=" + message);
    }
}

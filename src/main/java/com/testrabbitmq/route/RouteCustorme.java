package com.testrabbitmq.route;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zizi
 * @Version
 * @Description
 * @Date 2020/9/10 10:27
 */
@Component
public class RouteCustorme {

    //消费者1
    //绑定交换机
    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,//临时队列
                    exchange = @Exchange(value = "directs"),
                    key = {"error,info,warn"}
            )
    })
    public void recevie1(String message) {
        System.out.println("message1=" + message);
    }



    //消费者1
    //绑定交换机
    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,//临时队列
                    exchange = @Exchange(value = "directs"),
                    key = {"info,warn"}
            )
    })
    public void recevie2(String message) {
        System.out.println("message2=" + message);
    }



    //消费者1
    //绑定交换机
    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,//临时队列
                    exchange = @Exchange(value = "directs"),
                    key = {"error"}
            )
    })
    public void recevie3(String message) {
        System.out.println("message3=" + message);
    }


}

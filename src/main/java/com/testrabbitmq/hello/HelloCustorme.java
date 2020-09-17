package com.testrabbitmq.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zizi
 * @Version
 * @Description
 * @Date 2020/9/9 16:22
 */
@Component
@RabbitListener(queuesToDeclare = @Queue(value = "hello"))
public class HelloCustorme {
    @RabbitHandler
   public  void receive(String message){
        System.out.println("message="+message);
   }
}

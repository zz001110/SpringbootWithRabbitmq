package com.testrabbitmq.work;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zizi
 * @Version
 * @Description
 * @Date 2020/9/9 16:36
 */
@Component
public class WorkCustorme {


    //消费者1
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void recevie1(String message) {
        System.out.println("message1=" + message);
    }

    //消费者1
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void recevie2(String message) {
        System.out.println("message2=" + message);
    }
}

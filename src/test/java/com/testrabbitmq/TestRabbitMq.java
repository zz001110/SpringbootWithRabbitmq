package com.testrabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author zizi
 * @Version
 * @Description
 * @Date 2020/9/9 16:09
 */
@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class TestRabbitMq {
    //注入RabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //路由模式
    @Test
    public  void TestRoute(){
        rabbitTemplate.convertAndSend("directs","info","发送info的路由key的信息");
    }


    //广播模式
    @Test
    public  void  TestFanOut(){
      rabbitTemplate.convertAndSend("logs","","FanOut模型发送的消息");
    }

    //最简单的直联模式
    @Test
    public void Test() {
        rabbitTemplate.convertAndSend("hello", "hello  world");
    }


    //按劳分配
    @Test
    public void WorkTest() {
        rabbitTemplate.convertAndSend("work", "work 模型");
    }
}

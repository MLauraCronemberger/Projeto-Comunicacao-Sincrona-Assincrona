package com.example.demo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class QueueConsumer {

//    @RabbitListener(queues = {"${queue.name}"})
//    public void receive(@Payload String fileBody) {
//        System.out.println("Message " + fileBody);
//    }
    
    @RabbitListener(queues = "${queue.name}")
    public void receive(FileMessage message) {
        System.out.println("File Name: " + message.getFileName());
        System.out.println("Content: " + message.getContent());
    }

}

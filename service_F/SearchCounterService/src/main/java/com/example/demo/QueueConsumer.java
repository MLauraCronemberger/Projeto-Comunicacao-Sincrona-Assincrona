package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {
	private final SearchCounterService service;
	
	public QueueConsumer (SearchCounterService service) {
		this.service = service;
	}
	
    @RabbitListener(queues = "${queue.name}")
    public void consume(String msg) {
        System.out.println("Incrementando...");

        service.increment();
    }

}

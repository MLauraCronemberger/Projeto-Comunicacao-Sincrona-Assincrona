package com.example.demo;
import org.apache.logging.log4j.message.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class QueueConsumer {
	
	private final MediaAdaptationService service;
	
	public QueueConsumer (MediaAdaptationService service) {
		this.service = service;
	}
	
    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload MediaAdaptation nova_adaptacao) {
    	service.salvar_adaptacao(nova_adaptacao);
    	
        System.out.println("Nova Adaptacao do Livro:" + nova_adaptacao.getLivro_id() + "acabou de ser registrada!");
    }

}

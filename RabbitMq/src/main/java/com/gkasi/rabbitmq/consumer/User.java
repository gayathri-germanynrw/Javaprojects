package com.gkasi.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.gkasi.rabbitmq.config.MessageConfig;
import com.gkasi.rabbitmq.dto.OrderStatus;

@Component
public class User {
	@RabbitListener(queues = MessageConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from Queue :" + orderStatus);
	}

}

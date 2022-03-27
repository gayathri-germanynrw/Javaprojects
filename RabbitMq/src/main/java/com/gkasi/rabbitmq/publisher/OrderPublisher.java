package com.gkasi.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gkasi.rabbitmq.config.MessageConfig;
import com.gkasi.rabbitmq.dto.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;

	@PostMapping("/{restaurantname}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurantname) {

		order.setOrderId(UUID.randomUUID().toString());
		OrderStatus orderStatus = new OrderStatus(order, "Process", "successfully delivered" + restaurantname);
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTINGKEY, orderStatus);
		return "success";
	}
}

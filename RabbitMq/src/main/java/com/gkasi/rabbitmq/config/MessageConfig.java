package com.gkasi.rabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.JsonbMessageConverter;

@Configuration
public class MessageConfig {

	public static final String QUEUE = "testing_queue";
	public static final String EXCHANGE = "testing_exchange";
	public static final String ROUTINGKEY = "routingkey";

	public Queue queue() {
		return new Queue(QUEUE);
	}

	public TopicExchange exchange() {
		return new TopicExchange(EXCHANGE);
	}

	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);

	}

	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();

	}
    @Bean
	public AmqpTemplate template(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(converter());
		return rabbitTemplate;
	}

}

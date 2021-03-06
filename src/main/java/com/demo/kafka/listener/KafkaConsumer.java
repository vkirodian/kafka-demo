package com.demo.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "TestTopic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Message : " + message);
	}
}

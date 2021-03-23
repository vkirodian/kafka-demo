package com.demo.kafka.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.model.Department;
import com.demo.kafka.model.User;

@RestController
@RequestMapping("/pubsub")
public class PubSubController {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplateUser;

	@Autowired
	private KafkaTemplate<String, Department> kafkaTemplateDepartment;

	private final String TOPIC = "TestTopic";

	@GetMapping("user/{name}")
	public String publishUser(@PathVariable("name") String name) {
		User user = new User(UUID.randomUUID().toString(), name, 2000L);
		kafkaTemplateUser.send(TOPIC, user);
		return user.toString();
	}

	@GetMapping("dept/{name}")
	public String publishDept(@PathVariable("name") String name) {
		Department dept = new Department(UUID.randomUUID().toString(), name);
		kafkaTemplateDepartment.send(TOPIC, dept);
		return dept.toString();
	}
}

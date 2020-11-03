package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IbmmqApplicationTests {

	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private  Receiver receiver;

	@Test
	public void testReceive() throws Exception {
		this.jmsTemplate.convertAndSend("helloworld.q", "Hello, world!");
		this.jmsTemplate.convertAndSend("helloworld.topic2", "testdemo");

		this.jmsTemplate.setReceiveTimeout(10_000);
		assertThat(this.jmsTemplate.receiveAndConvert("helloworld.q").toString()).isEqualTo("Hello, world!");
	}

}

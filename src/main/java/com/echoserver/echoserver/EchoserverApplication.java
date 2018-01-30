package com.echoserver.echoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class EchoserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoserverApplication.class, args);
	}
}

package com.echoserver.echoserver.config;

import com.echoserver.echoserver.NexmoWebSocketHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Component
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry){
        registry.addHandler(new NexmoWebSocketHandler(),"/nexmo").setAllowedOrigins("*").withSockJS();
    }
}

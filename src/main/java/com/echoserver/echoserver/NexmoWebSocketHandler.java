package com.echoserver.echoserver;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class NexmoWebSocketHandler extends BinaryWebSocketHandler {

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        if (message instanceof TextMessage) {
            // Ignore Initial text message
        } else {
            // Send back audio bytes
            session.sendMessage(message);
        }
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}

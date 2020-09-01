package com.example.ds_project.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.TomcatRequestUpgradeStrategy;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfigurer implements WebSocketMessageBrokerConfigurer {

    @Override
    //registering the endpoint that the client will use to connect to our websocket.
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws");
        registry.addEndpoint("/ws").withSockJS();

    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        /*
        messages whose destination starts with "/topic" should be routed
        to the message broker which will broadcast the message to all subscribed clients.
        */

        registry.enableSimpleBroker("/topic");
        /*
         all the messages sent from the clients with the destination starting "/app" will
         be routed will be sent to the main controller
         */
        registry.setApplicationDestinationPrefixes("/app");

    }
}

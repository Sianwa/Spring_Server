package com.example.ds_project.controllers;

import com.google.gson.Gson;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.ArrayList;


public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        ArrayList<String> ToyPricesList = new ArrayList<String>();

        ToyPricesList.add(message.getPayload());
        System.out.println(ToyPricesList);
    }
}

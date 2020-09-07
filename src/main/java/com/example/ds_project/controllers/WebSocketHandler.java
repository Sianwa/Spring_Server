package com.example.ds_project.controllers;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;


public class WebSocketHandler extends TextWebSocketHandler {
    ArrayList<Integer> ToyPricesList = new ArrayList<Integer>();
    int TotalBill = 0;
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        if(session != null) {
            String ClientMessage = message.getPayload();
            int payload = Integer.parseInt(ClientMessage);
            ToyPricesList.add(payload);

            for (int i = 0; i < ToyPricesList.size(); i++){
                TotalBill += ToyPricesList.get(i);
            }
            System.out.println(ToyPricesList + "Sum total:" + TotalBill);
            session.sendMessage(new TextMessage(String.valueOf(TotalBill)));

        }
    }

}

package com.example.ds_project.controllers;
import ch.qos.logback.core.net.server.Client;
import com.google.gson.Gson;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class WebSocketHandler extends TextWebSocketHandler {
    ArrayList<Integer> ToyPricesList = new ArrayList<Integer>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        session.sendMessage(new TextMessage("Please send toy information"));
        System.out.println("Connected to android client");
    }
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        if(session != null) {
            int TotalBill = 0;
            //this section of the code receives the json data containing all toy info
            //it then maps out the price from the object and converts it into a POJO
            //which is then added to a cart array list that will generate the total for all cart items
            String ClientMessage = message.getPayload();
            if (ClientMessage.startsWith("{")) {
                System.out.println(ClientMessage);
                Map value = new Gson().fromJson(ClientMessage, Map.class);

                double payload = (double) value.get("price");
                ToyPricesList.add((int) payload);

                for (int i = 0; i < ToyPricesList.size(); i++) {
                    TotalBill += ToyPricesList.get(i);
                }
                System.out.println(ToyPricesList + "Sum total:" + TotalBill);
                session.sendMessage(new TextMessage(String.valueOf(TotalBill)));
            }
            else
            {
                System.out.println(ClientMessage);
            }
        }

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        session.close();
        System.out.println("Connection to android client is now closed");
    }
}

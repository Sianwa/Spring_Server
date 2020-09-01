package com.example.ds_project.controllers;

import com.example.ds_project.models.ClientMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @MessageMapping("/cart")
    @SendTo("/topic/greetings")
    public ClientMessage sendToyInformation(ClientMessage clientMessage) {
        //todo get toy information data and send it back to the client
        System.out.println("message received from client...");
        return new ClientMessage("welcome to the server");
    }

}
package com.jorjill.websocket_demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    // when receiving
    @MessageMapping("/hello")
    // when sending
    @SendTo("/topic/greetings")
    public Greeting greet(HelloMessage message){
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()));
    }

}

package com.real_time_notification.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    private String sendNotification(String message){
        String notificationTime = "Real-time notification at "+ System.currentTimeMillis();
        System.out.println("notification time :"+ notificationTime);
        return message;
    }
}

package org.spring.example.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message sent: " + message);
    }

}

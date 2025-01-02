package org.spring.example.consumer;

import org.spring.example.service.MessageService;

public class MessageProcessor {
    private MessageService messageService;

    // Constructor for dependency injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}


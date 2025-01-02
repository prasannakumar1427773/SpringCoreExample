package org.spring.example.consumer;

import org.spring.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;


/* Dependency Injection (DI) is a core concept in Spring Framework that allows for the decoupling of the creation
and dependency management of objects. This enables better modularity and testability of the code. Let me break it down for you.
 */

/* 1. Constructor injection
   2. Setter Injection
   3. Filed Injection   Dependencies are directly injected into the fields of the class, usually using annotations like @Autowired.
   4. Interface Injection (not commonly used in Spring)
 */
public class MessageProcessor {

    private MessageService messageService;

    // Filed Injection     no need to define in applicationContext.xml we usually use this in realtime
    @Autowired
    //private MessageService messageService;

    // Constructor for dependency injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    // Setter for dependency injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}


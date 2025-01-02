package org.spring.example;

import org.spring.example.consumer.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /*We load the Spring configuration file using ClassPathXmlApplicationContext.
    We retrieve the messageProcessor bean from the application context.
    We use the messageProcessor to process a message.*/

    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the messageProcessor bean
        MessageProcessor processor = (MessageProcessor) context.getBean("messageProcessor");

        // Use the messageProcessor to process a message
        processor.processMessage("Hello, Spring Core!");
    }

}
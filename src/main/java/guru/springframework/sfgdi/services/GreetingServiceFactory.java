package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    public GreetingServiceFactory() {
    }

    public GreetingService createGreetingService(String type) {

        switch (type) {
            case "bye":
                return new ByeGreetingService();
            case "whatsup":
                return new WhatUpGreetingService();
            default:
                return new HelloGreetingService();
        }
    }
}

package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    @Profile({"default","PROD"})
    public GreetingService helloGreetingService() {
        return new GreetingServiceFactory().createGreetingService("hello");
    }

    @Bean
    @Primary
    @Profile({"DEV"})
    public GreetingService byeGreetingService() {
        return new GreetingServiceFactory().createGreetingService("bye");
    }

    @Bean
    @Primary
    @Profile({"STAGING"})
    public GreetingService whatsupGreetingService() {
        return new GreetingServiceFactory().createGreetingService("whatsup");
    }

}

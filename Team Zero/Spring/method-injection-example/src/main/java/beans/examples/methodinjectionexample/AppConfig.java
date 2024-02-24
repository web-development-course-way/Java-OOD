package beans.examples.methodinjectionexample;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }

    @Bean
    public MessageProcessor messageProcessor() {
        return new MessageProcessor();
    }
}
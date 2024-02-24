package beans.examples.beanslifecycleexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "customDestroy")
    public MyBean myBean() {
        return new MyBean();
    }
}
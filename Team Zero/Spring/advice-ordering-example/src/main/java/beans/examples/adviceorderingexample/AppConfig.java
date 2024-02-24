package beans.examples.adviceorderingexample;
import beans.examples.adviceorderingexample.aspect.MyAspect;
import beans.examples.adviceorderingexample.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
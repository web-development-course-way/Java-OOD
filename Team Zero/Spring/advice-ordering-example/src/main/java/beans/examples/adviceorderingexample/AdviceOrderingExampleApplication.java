package beans.examples.adviceorderingexample;

import beans.examples.adviceorderingexample.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AdviceOrderingExampleApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			MyService myService = context.getBean(MyService.class);
			myService.doSomething();
		}
	}
}

package beans.examples.customannotationexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "beans.examples.customannotationexample")
public class CustomAnnotationExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomAnnotationExampleApplication.class, args);
		MyService myService = context.getBean(MyService.class);
		myService.myMethod();
	}
}

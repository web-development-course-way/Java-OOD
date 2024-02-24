package beans.examples.beanslifecycleexample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansLifecycleExampleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBean myBean = context.getBean(MyBean.class);
		context.close();
	}
}

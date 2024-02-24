package beans.examples.methodinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MethodInjectionExampleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		MessageProcessor messageProcessor = context.getBean(MessageProcessor.class);
		messageProcessor.setMessageService(messageService);
		messageProcessor.processMessage("Hello, World!");
		context.close();
	}
}

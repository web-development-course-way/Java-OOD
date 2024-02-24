package beans.examples.singletonvsprototypebeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SingletonVsPrototypeBeansApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SingletonVsPrototypeBeansApplication.class, args);

		IdGenerationService idGenerationService = context.getBean(IdGenerationService.class);

		System.out.println("Singleton ID 1: " + idGenerationService.getNextSingletonId());
		System.out.println("Singleton ID 2: " + idGenerationService.getNextSingletonId());

		System.out.println("Prototype ID 1: " + idGenerationService.getNextPrototypeId());
		System.out.println("Prototype ID 2: " + idGenerationService.getNextPrototypeId());
	}}

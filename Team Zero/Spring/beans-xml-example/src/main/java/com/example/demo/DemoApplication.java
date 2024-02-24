package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//UserService userService = (UserService) context.getBean("userService");

		//User user = new User("John Doe", 30);
//		user.setName("John Doe");
//		user.setAge(30);

		//userService.saveUser(user);
	}
}

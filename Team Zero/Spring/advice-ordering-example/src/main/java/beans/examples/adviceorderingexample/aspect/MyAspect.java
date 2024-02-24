package beans.examples.adviceorderingexample.aspect;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class MyAspect {

    @After("execution(* beans.examples.adviceorderingexample.service.*.*(..))")
    @Order(1)
    public void logMethodEntry() {
        System.out.println("Logging method entry");
    }

    @After("execution(* beans.examples.adviceorderingexample.service.*.*(..))")
    @Order(2)
    public void performAudit() {
        System.out.println("Performing audit");
    }

    @After("execution(* beans.examples.adviceorderingexample.service.*.*(..))")
    @Order(3)
    public void logMethodExit() {
        System.out.println("Logging method exit");
    }
}
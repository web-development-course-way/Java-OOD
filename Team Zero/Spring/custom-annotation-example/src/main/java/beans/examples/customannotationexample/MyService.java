package beans.examples.customannotationexample;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    @LogExecutionTime
    public void myMethod() {
        // Method implementation
        System.out.println("myMethod() is executing...");
        try {
            Thread.sleep(1000); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("myMethod() completed.");
    }
}

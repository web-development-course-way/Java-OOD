package org.example;


public class Main {
    public static void main(String[] args) {
        RealImage image = new RealImage("example.jpg");

        // Create multiple threads that call display() concurrently
        Thread thread1 = new Thread(() -> {
            image.display();
        });

        Thread thread2 = new Thread(() -> {
            image.display();
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
// Java program to illustrate 
// ThreadPool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class to be executed (Step 1) 
class Task implements Runnable {
    private int num;
    public Task(int num) {
        this.num = num;
    }
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println("Task" + num + " Singleton object reference ---> " + s);
    }
}

public class Main {
    // Maximum number of threads in thread pool
    static final int MAX_T = 10;
    public static void main(String[] args) {
        // creates five tasks
        Runnable r0 = new Task(0);
        Runnable r1 = new Task(1);
        Runnable r2 = new Task(2);
        Runnable r3 = new Task(3);
        Runnable r4 = new Task(4);
        Runnable r5 = new Task(5);
        Runnable r6 = new Task(6);
        Runnable r7 = new Task(7);
        Runnable r8 = new Task(8);
        Runnable r9 = new Task(9);

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r0);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r7);
        pool.execute(r8);
        pool.execute(r9);

        // pool shutdown ( Step 4)
        pool.shutdown();
    }
}


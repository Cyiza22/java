package practiceThreads;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 thread = new thread3();
        Thread t3 = new Thread(thread); // Create a new thread using the Runnable implementation
        t1.start();
        t1.join();
        // Wait for thread1 to finish before starting thread2
        t2.start();
        t2.yield();
        t3.start(); // This will not start a new thread, it will run in the main thread
        
        t3.start(); 
        t3.join();// This will not start a new thread, it will run in the main thread
        System.out.println("Threads are running");
    }
    
}

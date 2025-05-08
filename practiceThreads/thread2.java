package practiceThreads;

public class thread2 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(7000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " interrupted. " + e.getMessage());
            }
        }
    }
    
}

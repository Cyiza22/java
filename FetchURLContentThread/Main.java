package FetchURLContentThread;

public class Main {
    public static void main(String[] args) {
        // String url = "https://jsonplaceholder.typicode.com/posts"; 
        String url = "https://www.instagram.com/";
        URLFetcherThread fetcher = new URLFetcherThread(url);
        Thread thread = new Thread(fetcher);
        thread.start();

        try {
            thread.join(); 
            System.out.println("Content fetched:\n" + fetcher.getContent());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
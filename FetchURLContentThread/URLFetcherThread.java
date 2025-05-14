package FetchURLContentThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLFetcherThread implements Runnable {
    private String urlString;
    private String content;

    public URLFetcherThread(String url) {
        this.urlString = url; 
    }

    @Override
    public void run() {
        BufferedReader in = null;
        try {
            URL url = new URL(urlString); 
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0"); 

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder contentReader = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                contentReader.append(inputLine).append("\n");
            }

            content = contentReader.toString();

        } catch (Exception e) {
            content = "Error fetching content: " + e.getMessage();
        } finally {
            try {
                if (in != null) in.close(); 
            } catch (Exception e) {
                System.out.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }

    public String getContent() {
        return content;
    }
}

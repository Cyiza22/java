package genericassignment;

public class Main {
    public static void main(String[] args) {
        // Create a pair with String key and Integer value
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);

        // Create a pair with Integer key and String value
        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");

        // Print the pairs
        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());
    }
}
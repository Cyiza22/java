package genericassignment;

public class Main {
    public static void main(String[] args) {
        
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);

        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());
        System.out.println("Pair 3: " + Pair.create("Name", "John Doe").toString());
        System.out.println("Pair 4: " + Pair.create(1, 2.5).toString());
        System.out.println("Pair 5: " + Pair.create(1, 2).toString());
        System.out.println("Pair 6: " + Pair.create(1.5, 2.5).toString());
        System.out.println("Pair 7: " + Pair.create(1.5, "Hello").toString());
    }
}
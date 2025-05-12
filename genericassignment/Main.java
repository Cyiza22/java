package genericassignment;

public class Main {
    public static void main(String[] args) {
        
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");
        Pair<String, Integer> pair8 = new Pair<>("Age", 25);

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());
        System.out.println("Pair 3: " + Pair.create("Name", "John Doe"));
        System.out.println("Pair 4: " + Pair.create(1, 2.5));
        System.out.println("Pair 5: " + Pair.create(1, 2).toString());
        System.out.println("Pair 6: " + Pair.create(1.5, 2.5).toString());
        System.out.println("Pair 7: " + Pair.create(1.5, "Hello").toString());
        System.out.println("Is Pair 1 equal to Pair 2? " + pair1.equals(pair2));
        System.out.println("Is Pair 1 equal to Pair 8? " + pair1.equals(pair8)); 
        System.out.println("HashCode of Pair 1: " + pair1.hashCode());
        System.out.println("HashCode of Pair 2: " + pair2.hashCode());
        System.out.println("HashCode of Pair 3: " + pair8.hashCode());
    }
}
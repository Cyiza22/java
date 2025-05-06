package randomProjects;
import java.util.Comparator;
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

public class NameComparator {
    public static void main(String[] args) {
        Comparator<Person> compareByName = (p1, p2) -> p1.getName().compareTo(p2.getName());

        // Example usage:
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Charlie");

        System.out.println("Comparing Alice and Bob: " + compareByName.compare(person1, person2));
        System.out.println("Comparing Bob and Alice: " + compareByName.compare(person2, person1));
        System.out.println("Comparing Alice and Alice: " + compareByName.compare(person1, person1));
    }
}
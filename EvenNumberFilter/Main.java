package EvenNumberFilter;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = EvenNumberFilter.filterEvenNumbers(numbers);
        System.out.println(evenNumbers); 
    }
}
package GenericmergeArrays;
public class Main {
    public static void main(String[] args) {
        // integer array
        Integer[] firstIntArray = {1, 2, 3};
        Integer[] secondIntArray = {4, 5, 6};

        Integer[] mergedIntArray = GenericArrayUtility.mergeArrays(firstIntArray, secondIntArray);

        System.out.print("Merged Integer Array: ");
        printArray(mergedIntArray); 

        // double array
        Double[] firstDoubleArray = {1.1, 2.2};
        Double[] secondDoubleArray = {3.3, 4.4};
        Double[] mergedDoubleArray = GenericArrayUtility.mergeArrays(firstDoubleArray, secondDoubleArray);
        System.out.print("Merged Double Array: ");
        printArray(mergedDoubleArray);

        // string array
        String[] firstStringArray = {"apple", "banana"};
        String[] secondStringArray = {"cherry", "date"};

        String[] mergedStringArray = GenericArrayUtility.mergeArrays(firstStringArray, secondStringArray);
        System.out.print("Merged String Array: ");
        printArray(mergedStringArray);

        //null array
        String[] firstNullArray = null;
        String[] secondNullArray = null;
        String[] mergedNullArray = GenericArrayUtility.mergeArrays(firstNullArray, secondNullArray);
        System.out.print("Merged Null Array: ");
        printArray(mergedNullArray);
    }
    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


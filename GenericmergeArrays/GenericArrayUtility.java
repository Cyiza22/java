package GenericmergeArrays;
import java.util.Arrays;
import java.lang.reflect.Array;

public class GenericArrayUtility {

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null || b == null) {
            try {
                return (T[]) Array.newInstance(a.getClass().getComponentType(), 0);
            } catch (NullPointerException e) {
                return (T[]) new Object[0];
            }
        }
        if (a.length == 0) {
            return Arrays.copyOf(b, b.length);
        }
        if (b.length == 0) {
            return Arrays.copyOf(a, a.length);
        }
        T[] result = Arrays.copyOf(a, a.length + b.length);

        System.arraycopy(b,0, result, a.length, b.length);

        return result;
    }
}

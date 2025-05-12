package genericassignment;
import java.util.Objects;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }

    public static <K, V>Pair<K, V>  create(K key, V value) {
        return new Pair<K, V>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String toString() {
        return "key: " + key + ", value: " + value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair other = (Pair) obj;
        return Objects.equals(this.key, other.key) && Objects.equals(this.value, other.value);
    }

    public int hashCode() {
        return Objects.hash(key, value);
    }
}

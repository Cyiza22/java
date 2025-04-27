package genericassignment;
import java.util.Objects;

// Pair.java

import java.util.Objects;

public class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // toString method
    public String toString() {
        return "(Key: " + key + ", Value: " + value + ")";
    }

    // equals method
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> other = (Pair<?, ?>) o;
        return Objects.equals(key, other.key) && Objects.equals(value, other.value);
    }

    // hashCode method
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
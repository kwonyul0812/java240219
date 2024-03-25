package pr13.exercise.p3;

public class Container<K, V> {
    private K name;
    private V value;

    public void set(K k, V v) {
        name = k;
        value = v;
    }

    public K getKey() {
        return name;
    }

    public V getValue() {
        return value;
    }
}

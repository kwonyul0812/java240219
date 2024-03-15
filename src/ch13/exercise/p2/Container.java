package ch13.exercise.p2;

public class Container<T> {
    private T param;

    public T get() {
        return param;
    }

    public void set(T param) {
        this.param = param;
    }
}

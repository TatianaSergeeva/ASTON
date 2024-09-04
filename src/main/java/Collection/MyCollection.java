package Collection;

public class MyCollection<T> {

    private final T[] obj;
    private int size;

    public MyCollection(int capacity) {
        this.obj = (T[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void add(T object) {
        obj[size] = object;
        size++;
    }

    public T get(int number) {
        return obj[number];
    }

}

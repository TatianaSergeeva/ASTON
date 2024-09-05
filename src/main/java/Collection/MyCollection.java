package Collection;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> implements MyList {

    private final T[] obj;
    private int size;

    public MyCollection(int capacity) {
        this.obj = (T[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Object t) {
        for (T t1 : obj)
            if (t1.equals(t)) {
                return true;
            }
        return false;
    }

    public T get(int number) {
        return obj[number];
    }

    public void add(Object t) {
        obj[size] = (T) t;
        size++;
    }
}

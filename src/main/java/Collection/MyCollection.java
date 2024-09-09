package Collection;

public class MyCollection<T> implements MyList {

    private T[] obj;
    private int size;
    private final int CAPASITY = 10;

    public MyCollection() {
        this.obj = (T[]) new Object[CAPASITY];
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean contains(Object t) {
        for (T t1 : obj)
            if (t1.equals(t)) {
                return true;
            }
        return false;
    }

    @Override
    public T get(int number) {
        return obj[number];
    }

    @Override
    public void add(Object t) {
        if (getSize() == obj.length) {
            grow();
        }
        obj[size] = (T) t;
        size++;
    }

    @Override
    public void grow() {
        T[] newArray = (T[]) new Object[obj.length * 2];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = newArray[i];
        }
        obj = newArray;
    }
}

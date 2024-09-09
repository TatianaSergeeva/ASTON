package Collection;

import java.util.ArrayList;
import java.util.List;

public interface MyList<T> {

    public boolean contains(T t);

    public Object get (int number);

    public void add (T t);

    public void grow ();

}
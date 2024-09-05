package Collection;

public class Main {

    public static void main(String[] args) {
        MyCollection<Object> collection = new MyCollection<>(10);
        Object t = new Object();
        collection.add(t);
        System.out.println(collection.getSize());
        System.out.println(collection.get(0));
        System.out.println(collection.contains(t));
    }
}

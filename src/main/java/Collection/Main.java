package Collection;

public class Main {

    public static void main(String[] args) {
        MyCollection<Object> collection = new MyCollection<>();
        Object t = new Object();
        collection.add(t);
        System.out.println(collection.getSize());
        System.out.println(collection.get(0));
        System.out.println(collection.contains(t));
        collection.grow();

        for (int i = 0; i < 12; i++) {
            collection.add(i);
        }


    }
}

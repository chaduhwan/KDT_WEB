package Generic;

class Pair<T,K>{
    private T key;
    private K value;

    public Pair(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }
    public K getValue() {
        return value;
    }
}
public class GenericWork {
    public static void main(String[] args) {
        Pair test1 = new Pair<>("One",1);
        Pair test2 = new Pair<>(2,"two");

        System.out.println("Key : " + test1.getKey() + " Value : " + test1.getValue());
        System.out.println("Key : " + test2.getKey() + " Value : " + test2.getValue());
    }
}

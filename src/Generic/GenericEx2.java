package Generic;

class Box<T extends Number> { // 숫자만 들어오도록 제한
    private T item;

    public void setItem (T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("무브무브");
    }
}

// 제네릭 클래쓰
class  Container <T extends Movable> {
    private T item;

    public Container (T item) {
        this.item = item;
    }

    public void makeItem() {
        item.move();
    }
}
public class GenericEx2 {

    public static void main(String[] args) {

//        Box <String> StrtBox = new Box<>();
//
//        StrtBox.setItem("Hello Box");
//        String value = StrtBox.getItem();
//        System.out.println(value);

        Box<Double> DouBox = new Box<>();
        DouBox.setItem(2.5);

        Container<Car> container = new Container<>(new Car());
        container.makeItem();

    }
}

package Generic;
import java.util.ArrayList;

// 일반 클래스
class MyCustomList {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element) {
        list.add(element);
    }
    public void removeElement(String element) {
        list.remove(element);
    }
}

// 제네릭 클래스
class MyCustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }
    public void removeElement(T element) {
        list.remove(element);
    }

    // <T> : 타입파라미터, 명시적으로 해당 메서드가 제네릭이라는 것을 표현.
    public T get(int i) {
        return list.get(i);
    }

}

public class GenericEx {

    public static void main(String[] args) {
        MyCustomList test = new MyCustomList();
        test.addElement("호호");

        MyCustomListGeneric<String> test2 = new MyCustomListGeneric<>();
        test2.addElement("하하");
        test2.removeElement("히히");
        String text = test2.get(0);
        System.out.println(text);

    }
}

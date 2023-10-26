package Generic;
import java.util.ArrayList;

public class GenericEx3 {

    // 와일드 카드
    public void processList(ArrayList<? extends Number> list) {
//        list.add(1); 와일드 카드 때매 배열에 값을 넣진 못함 > 무슨 타입이 올지 모르기 때문
        for(Number num : list) { // 값을 읽을 순 있음
            System.out.println(num);
        }
    }

    // 타입 파라미터
    public <T> void addToNumberList(ArrayList<T> list, T item) {
        list.add(item); // 와일드 카드와 다르게 배열에 값 넣기 가능 !
    }

    //? super T : 하한 제한 > 위와 다르게 배열에 값을 넣을 수 있음 >> 하한 제한을 통해 최소한의 타입을 알 수 있기 때문!
    public void processListSuper (ArrayList<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public static void main(String[] args) {

        GenericEx3 example = new GenericEx3();

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        ArrayList<Double> DoubleList = new ArrayList<>();
        DoubleList.add(1.1);
        DoubleList.add(2.2);
        DoubleList.add(3.3);

        // 와일드카드 <? extends T> 은 주로 읽기전용으로 사용됨.
        example.processList(integerList);
        example.processList(DoubleList);

        example.addToNumberList(integerList, 4);
        example.addToNumberList(DoubleList, 4.4);

        System.out.println("---------------addToNumberList---------------");
        example.processList(integerList);
        example.processList(DoubleList);

        // 와일드 카드 <? super T> 는 주로 쓰기전용으로 사용됨.
        ArrayList<Number> numbers = new ArrayList<>();
        example.processListSuper(numbers);
        System.out.println(numbers);

        // 와일드 카드 주의사항
        // 1. 복잡성 : 와일드카드를 과도하게 사용하게되면 복잡성이 증가하며, 협업에 알맞지 않음.
        // 2. 제한된 작업 : '? extends T' 같은 경우 새로운 요소 추가 불가능



    }
}

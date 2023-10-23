import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Google");
        System.out.println(list);

        // add(index, element)
        list.add(0,"Amazon");
        System.out.println(list);

        //addAll
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Samsung");

        list.addAll(list2);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // contain(params) : ArrayList가 params를 포함하고 있는지 여부
        System.out.println(list.contains("Apple"));

        // get(index)
        System.out.println(list.get(1));

        // set (index, element) : 특정한 위치에 있는 값을 교체
        System.out.println(list.set(2,"Hyundai"));
        System.out.println(list);

        // indexOf(params)
        System.out.println(list.indexOf("Google"));

        // isEmpty() : ArrayList 가 비어있는지 확인
        System.out.println(list.isEmpty());

        // remove(index)
        list.remove(0);
        System.out.println(list);

        // clear()
        list.clear();
        System.out.println(list);

        Scanner scan = new Scanner(System.in);

        ArrayList<String> test = new ArrayList<>();

        while (true){
            System.out.println("문자를 입력해주세요");
            String input = scan.next();
            if(input.equals("exit")) {
                break;
            }
            test.add(input);
        }
        for (int i = 0 ; i < test.size() ; i ++) {
            System.out.println(test.get(i));
        }


    }
}

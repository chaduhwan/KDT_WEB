package Collection;

import java.util.*;

public class CollectionWork {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Set<Integer> hashset = new HashSet<>();
//        while (true) {
//            System.out.println("숫자를 입력하세요");
//            int num = scan.nextInt();
//            hashset.add(num);
//
//            if(num == -1) {
//                break;
//            }
//        }
//        System.out.println(hashset);
        Map<String, Integer> hashMap = new HashMap<>();
        while (true) {
            System.out.println("이름과 나이를 입력해주세요");
            String name = scan.next();
            if(name.equals("종료")) {
                break;
            }
            int age = scan.nextInt();
            scan.nextLine();
            hashMap.put(name,age);
        }
        // entrySet() : 해당 맵에 저장된 모든 키-값 쌍을 Set<Map.Entry<K,V> 형태로 반환
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey(); // 키 얻기
            Integer value = entry.getValue(); // 값 얻기
            System.out.println("이름: " + key + ", 나이: " + value);
        }

        scan.close();

    }
}

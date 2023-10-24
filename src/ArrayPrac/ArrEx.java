package ArrayPrac;

import java.util.Arrays;
import java.util.Scanner;


public class ArrEx {

    public static void main(String[] args) {

        // 방법 1. 배열 출력 기초
//        int[] intArray = {1,2,3,4,5};
//
//        for (int i = 0; i < intArray.length; i ++) {
//            System.out.print(intArray[i] + " ");
//        }


        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[5]; // 크키가 5인 int 배열
//
        System.out.println("숫자 5개를 입력하세요");
        for(int i = 0; i < intArray.length; i ++) {
            intArray[i] = scan.nextInt();
        }

        //방법 2. Array.toString 배열의 요소를 문자열로 반환 << 배열을 출력 시키기위해서 해야함 ! 그냥 intArray이 넣으면 안됨 !
//        System.out.print(Arrays.toString(intArray));

        // 방법 3. for-each 문 사용
        int sum = 0 ;
        for(int arr : intArray) {
            System.out.println(arr + "");
            sum += arr;
        }
        System.out.println(sum);

        scan.close();
    }
}

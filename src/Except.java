import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

    public static void main (String[] args){

        // 0 으로 나누는 경우
//        try {
//            int num1 = 4 ;
//            int num2 = 0 ;
//            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누는 에외가 발생하였습니다");
//            System.out.println(e);
//        }
//
//            System.out.println("여기까지 읽힐까 ?");

        // 인덱스 범위를 벗어났을 때
//        int[] intArray = {1, 2, 3, 4};
//
//        try {
//            for(int i = 0 ; i < 5 ; i++){
//                System.out.println(intArray[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("인덱스 범위가 벗어났습니다");
//                System.out.println(e);
//        }

        // 입력오류 발생
//        Scanner scan = new Scanner(System.in);
//        System.out.println("정수를 입력하세요");
//        try {
//            int num = scan.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("입력오류, 정수를 입력하세요");
//            System.out.println(e);
//
//        }
//        scan.close();

        // 숫자변환오류
        //NumberFormatException

        // 객체참조가 null인 상태에서 객체의 메서드나 속성에 접근할 때
        // NullPointerException

        // 파일이 존재하지 않을 때 (컴파일러에 의해 체크돔)
        //FileNotFoundException

        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요");
        try {
            int num = scan.nextInt();
            int[] intArray = new int[num]; // 크키가 5인 int 배열
            System.out.println("요소를 입력하세요");
            for(int i = 0 ; i < num  ;i++ ) {
                intArray[i] = scan.nextInt();
            }
            int sum = 0;
            for (int i =0 ; i <num  ; i ++) {
                sum += intArray[i];
            }
            System.out.println("숫자를 입력하세요");
            int dvd = scan.nextInt();
            System.out.println(sum/ dvd);
        } catch (InputMismatchException e) {
            System.out.println("입력오류, 정수를 입력하세요");
            System.out.println(e);

        }  catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 범위에서 벗어났습니다");
                System.out.println(e);
        }
        scan.close();




    }
}

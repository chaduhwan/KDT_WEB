import java.util.Scanner;


public class Condtion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.print("수를 입력하세요!");

//        int num = scan.nextInt();


        // if-else문

//        if(num % 3 == 0) {
//            System.out.println("3의 배수입니다!");
//        } else {
//            System.out.println("3의 배수가 아닙니다!");
//        }

        // switch 문
//        switch (num % 3) {
//            case 0 :
//                System.out.println("3의 배수입니다 !");
//                break;
//            default :
//                System.out.println("3의 배수가 아닙니다 !");
//        }

        // 문자열 비교
        // 자바에서 문자열은 String 자료형(레퍼런스 자료형) 이므로, 변수로 접근할 수 있는 값은 문자열이 저장된 주소 값이다.
        // 따라서 == 연산자로는 비교가 불가능.
        // 변수.equals("문자열") 형태로 비교해야함

//        System.out.println("이름을 입력하세요 ! ");
//        String name = scan.nextLine();
//
//        if(name.equals("코딩온")) {
//            System.out.println("코딩온님 환영합니다 !!!");
//        } else {
//            System.out.printf("%s님® 환영합니다 !!!", name).println();
//        }

//          System.out.println("나이를 입력하세요!");
//          int age = scan.nextInt();
//
//        if (age < 8) {
//            System.out.println("유아");
//        } else if (age < 13) {
//            System.out.println("초등학생");
//        } else if( age < 16) {
//            System.out.println("중학생");
//        } else if (age < 20) {
//            System.out.println("고등학생");
//        } else {
//            System.out.println("성인");
//        }

        System.out.println("이름을 입력하세요");
        String name = scan.next();

        if(name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요");
        }

        scan.close();

    }
}

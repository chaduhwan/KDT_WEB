import java.util.Scanner;

public class Over {

    // 자바스크립트
    // functiona(a, b, c) {}
    // a(1,2) 로 실행 하여도 오류가 나지않았음 ! but 자바는 다르다..

    // 메소드 오버로딩

    // 정수 두개를 더하는 메소드
    public int add(int a, int b) {
        return a + b;
    }

    // 실수 두개를 더하는 메소드
    public double add (double a, double b) {
        return  a + b;
    }

    // 정수 세개를 더하는 메소드
    public  int add(int a, int b, int c) {
        return a + b + c;
    }

    public  int diff(int a, int b) {return a - b;}

    public int div(int a, int b) {return a/b;}

    public int multi (int a ,int b) {return a*b;}

    public double Figure (double a) {return Math.pow(a,2)*Math.PI;};

    public double Figure (double a, double b, boolean T) {
        if(T) {
            return a * b;
        } else {
             return a*b/2;
        }
    };

    public double Figure (double a, int b) {return (a*b)/2;};


    public static void main(String[] args) {
        Over calc = new Over();

        Over figure = new Over();

//        System.out.println(calc.add(10, 11));
//        System.out.println(calc.add(0.15, 0.16));
//        System.out.println(calc.add(10, 11, 12));
//
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("숫자를 입력하세요!");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//
//        int add = calc.add(a,b);
//        int diff =calc.diff(a,b);
//        int divd = calc.div(a,b);
//        int multi = calc.multi(a,b);
//
//        System.out.println("더하기 결과" + add);
//        System.out.println("빼기 결과" + diff);
//        System.out.println("나누기 결과" + divd);
//        System.out.println("곱하기 결과" + multi);


        System.out.printf("반지름이 %d인 원의 넓이  %f%n", 5 ,figure.Figure(5));
        System.out.printf("가로 %d 세로 %d인 직사각형의 넓이  %f%n", 5, 6, figure.Figure(5,6,true));
        System.out.printf("밑변 %d 높이 %d 인의 삼각형 넓이 %f%n",5,6 ,figure.Figure(5,6,false));


    }

}

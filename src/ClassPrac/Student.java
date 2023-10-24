package ClassPrac;

public class Student extends Person {

    private String major;

    public Student(String name, int age, String major) {
        // super() : 하위 클래스에서 상위 클래스 생성자를 호출하는데 사용
        // super 키워드는 상위 클래스의 메서드를 호출하는데 사용
        // 항상 첫번째 줄에 있어야함 !!
        super (name, age);
        this.major = major;
    }

    @Override // 오버라이딩
    public String toString() {
        return "ClassPrac.Student / super " + super.toString() +", major : " + major ;
    }

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.
    public static class Main {
        public static void main(String[] args) {


            System.out.print("안녕하세요");
            System.out.printf("%d * %d = %d",10,2,10 * 2).println();
            System.out.printf("%.3f", 1.234654).println();
            // 형식 지정자
            // %d : 정수
            // %f : 실수 (%.3f : 소숫점 숫자 세번째 자리까지)
            // %s : 문자열
            // %c : 문자
            // %b : boolean




        }
    }
}

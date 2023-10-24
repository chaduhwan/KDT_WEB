
// Static 변수가 없는 경우

class WithoutStatic {
    private int registered = 0;
    private String name;

    public WithoutStatic(String name) {
        this.name = name;
        registered ++;
    }

    public int getRegistered() {
        return registered;
    }
}

class WithStatic {
    private static int registered = 0;
    private String name;

    public WithStatic(String name) {
        this.name = name;
        registered ++;
    }

    public int getRegistered() {
        return registered;
    }
}

// Static 메소드
class MathUtil {
    private static double PI = 3.14;
    // 메소드
    public static double circle(double radius) {
        return PI * radius * radius ;
    }
}




public class CompareStatic {
    public static void main(String[] args){

        // Static methods 는 객체 생성없이 접근 가능 !
        System.out.println(MathUtil.circle(3.3));

        // Static 이 없는 경우
        WithoutStatic a = new WithoutStatic("길동");
        WithoutStatic b = new WithoutStatic("몽룡");
        System.out.println("WithoutStatic");
        System.out.println("길동 : " + a.getRegistered());
        System.out.println("몽룡 : " + b.getRegistered());

        // Static 이 있는 경우
        WithStatic c = new WithStatic("춘향");
        WithStatic d = new WithStatic("꺽정");
        System.out.println("WithStatic");
        System.out.println("춘향 : " + c.getRegistered());
        System.out.println("꺽정 : " + d.getRegistered());
    }
}

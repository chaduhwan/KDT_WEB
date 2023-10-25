package AbstractEx;

//추상클래스
abstract class Animal {
    private int age;
    // 추상메서드
    abstract public void sound();

    // 일반메서드
    public void sleep() {
        System.out.println("쿨쿨");
    }
}
abstract class Student {
    public String name;
    public String school;
    public int age;
    public int number;

    abstract public void todo();
}

// 추상클래스 Animal를 상속받는 Chicken 클래스
class Chicken extends Animal {
    @Override
    public void sound() { // 추상클래스에 추상메서드를 만들 시 상속받는 자식클래스에서 무조건 사용되어야함 !!
    System.out.println("꼬꼬댁!");
    }
}

class Kim extends Student {
    public Kim(String name, String school, int age, int number) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.number = number;
    }
    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥!");
    }
}
class Beak extends Student {
    public Beak(String name, String school, int age, int number) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.number = number;
    }
    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자!");
    }
}

public class AbstractExamlpe {
    // 추상클래스는 인스턴스화 할 수 없음!

    public static void main(String[] args) {
        Chicken CcoCco = new Chicken();
        // 추상클래스는 인스턴스화 할 수 없음!
//        Animal ani = new Animal();
//        CcoCco.sound();
//        CcoCco.sleep();
        Kim Kim = new Kim("김씨","코딩온",25,20182889);
        Beak Beak = new Beak("백씨","코딩온",25,20182889);

        Kim.todo();
        Beak.todo();

    }
}

package InterfaceEx;

// 다형성
// 하나의 인터페이스나 클래스를 여러가지 방식으로 동작하게 하는 것

import ClassPrac.Dog;

// 1. 일반 클래스를 사용한 다형성
class Animal {
    public void sound() {
        System.out.println("동물은 소리를 냅니다");
    }
}

class dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class cat extends Animal {
    @Override
    public void sound() {
        System.out.println("냐옹냐옹");
    }
}

// 2. 추상클래스를 사용한 다양성
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    public Circle (double r ) {
        this.radius =r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle (double w, double  h) {
        this.width = w;
        this.height = h;
    }
    double area() {
        return width * height;
    }
}

// 3. 인터페이스를 사용한 다형성
interface Flyable {
    void fly();
}

class bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("새가 날아든다");
    }
}
class airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("비행기가 운항중");
    }
}
public class Polymorphism {
    public static void main(String[] args) {

        // 다형성을 활용하여 Animal 타입을 참조 변수로 dog와 cat 객체를 참조
       Animal dog = new dog();
       Animal cat = new cat();
       dog.sound();
       cat.sound();


       Shape s1 = new Circle(3.3);
       Shape s2 = new Rectangle(4, 6.5);
       Shape[] s3= {new Circle(3.4), new Rectangle(3,4)};

//       System.out.printf("%.2f",s1.area()).println();
//       System.out.printf("%.2f",s2.area()).println();
       for (Shape s : s3) {
           System.out.printf("%.2f",s.area()).println();
       }

//       instanceof : 객체가 특정클래스나 인터페이스의 인스턴스인지 확인하는 연산자

       Flyable f1 = new bird();
       Flyable f2 = new airplane();
       f1.fly();
       f2.fly();

    }
}

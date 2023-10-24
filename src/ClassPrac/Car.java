package ClassPrac;

public class Car {

    // 접근 제어
    // public : 같은 클래스 o, 같은 패키지 o, 자식 클래스 o, 전체 o
    // protected : 같은 클래스 o, 같은 패키지 o, 자식 클래스 o, 전체 x
    // default : 같은 클래스 o, 같은 패키지 o, 자식 클래스 x, 전체 x
    // private : 같은 클래스 o, 같은 패키지 x, 자식 클래스 x, 전체 x

    // 멤버 변수
    private int speed;

    // 생성자
    // 클래스명과 동일해야함
    public Car(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("ClassPrac.Car start!");
    }

//    // setter 메소드
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    // getter 메소드
//    public int getSpeed() {
//        return this.speed;
//    }
    public void increaseSpeed (int speed) {
        this.speed = this.speed + speed;
    }

    // 마우스 클릭으로 간편하게 만들 수 있다 !!
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // 유효성 검사 잘못된 값에 대해 객체를 보호
        if(speed >= 0) {
            this.speed = speed;
        }
    }
}

package InterfaceEx;

interface Move {
    void moveForward();
    void moveBackword();
}

interface Power {
    void powerOn();
    void powerOff();
}

// 안터페이스는 인터페이스를 상속 받을 수 있음 !!
// 다중 상속이 가능하다
interface Car extends Move, Power{
    void changeGear(int gear);
}

class Suv implements Car {
    @Override
    public void moveForward() {
        System.out.println("전진");
    }
    @Override
    public void moveBackword() {
        System.out.println("후진");
    }
    @Override
    public void powerOn() {
        System.out.println("부르릉");
    }
    @Override
    public void powerOff() {
        System.out.println("흥");
    }
    @Override
    public void changeGear(int gear) {
        System.out.println("기어변경 : " + gear + " 단");
    }
}
public class InterfaceEample2 {

    public static void main (String[] args) {
        Suv Santape = new Suv();
        Santape.powerOn();
        Santape.changeGear(2);
        Santape.moveForward();
        Santape.moveBackword();
        Santape.powerOff();
    }
}

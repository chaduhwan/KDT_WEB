package ClassPrac;

public class CarContainer {

    public static void main (String[] args) {
        Car bmw = new Car(100);
        Car benz = new Car(100);

        // 잘못된 접근 방법
//        bmw.speed = 120;
//        benz.speed = 120;


        bmw.start();
        benz.start();

        // 올바른 접근 방법
//        bmw.setSpeed(120);
//        benz.setSpeed(120);

        // 잘못된 값에 대해 개체를 보호
        bmw.setSpeed(-120);
        benz.setSpeed(-120);

//        int bmwSpeed = bmw.getSpeed();
//        bmwSpeed = bmwSpeed + 100;
//        bmw.setSpeed(bmwSpeed);

//        int BenzSpeed = benz.getSpeed();
//        BenzSpeed = BenzSpeed + 80;
//        benz.setSpeed(BenzSpeed);

        bmw.increaseSpeed(140);
        benz.increaseSpeed(160);


        System.out.println("BMW " + bmw.getSpeed());
        System.out.println("BENZ " + benz.getSpeed());




    }
}

package ClassWork;

abstract class Vehicle{
    public String name;
    public int maxSpeed;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    abstract public void move();
}

interface Flyable {
    void fly();
}

class car extends Vehicle {
    public car(String name, int speed) {
        this.name = name;
        this.maxSpeed = speed;
    }

    @Override
    public void move() {
        System.out.println("도로 따라 이동중");
    }
}

class Airplane extends Vehicle implements Flyable {
    public Airplane(String name, int speed) {
        this.name = name;
        this.maxSpeed = speed;
    }

    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행중");
    }
}
public class WorkMain {
    public static void main (String[] args) {
        Vehicle[] test = {new car("Benz", 200), new Airplane("boig",1200)};
        for (Vehicle t : test) {
            System.out.println(t.getName() + " 지금 속도는 " + t.getMaxSpeed());
            t.move();
            if (t instanceof Flyable) {
                ((Flyable) t).fly();
            }
        }
    }
}

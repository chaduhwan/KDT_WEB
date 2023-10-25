package InterfaceEx;

interface controller {
    void poweOn();
    void poweOff();
    default void display() {
        System.out.println("하하하하");
    };
}

class TV implements controller {
    @Override
    public void poweOn() {
        System.out.println("TV power On");
    }

    @Override
    public void poweOff() {
        System.out.println("TV power Off");
    }
}

class Computer implements controller {
    @Override
    public void poweOn() {
        System.out.println("Computer power On");
    }

    @Override
    public void poweOff() {
        System.out.println("Computer power Off");
    }
}
public class InterfaceExample {
    public static void main (String[] args) {

        TV tv = new TV();
        tv.poweOn();
        tv.poweOff();

        Computer computer = new Computer();
        computer.poweOn();
        computer.poweOff();

        tv.display();
        computer.display();
    }
}

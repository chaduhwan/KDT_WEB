package ClassPrac;

public class Vehicle {

    private int wheels;
    private String specis;
    private int passengers;

    public Vehicle(int wheels, String specis, int passengers) {
        this.wheels = wheels;
        this.specis = specis;
        this.passengers = passengers;
    }
    public String whom() {
        return "Vehicle / " + "wheels : " + wheels + " specis : " + specis + " passengers : " + passengers;
    }
}

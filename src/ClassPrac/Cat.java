package ClassPrac;

public class Cat extends Animal {
    public Cat(String Specis, String name, int age) {
        super(Specis, name, age);
    }

    @Override
    public String MakeSound(){
        return "meow";
    }

}

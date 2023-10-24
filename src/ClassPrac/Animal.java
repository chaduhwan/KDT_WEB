package ClassPrac;

public class Animal {
    private String Species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        Species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String MakeSound() {
        return "동물은 소리를 낸다!";
    }
}

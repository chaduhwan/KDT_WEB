package ClassPrac;

public class ClassMain {

    public static void main(String[] args) {
//        //ClassPrac.Person (슈퍼 클래스) 인스턴스 생성
//        ClassPrac.Person person = new ClassPrac.Person("홍길동",30);
//
//        System.out.println(person.toString());
//
//        // ClassPrac.Student (하위 클래스) 인스턴스 생성
//        ClassPrac.Student student = new ClassPrac.Student("이몽룡", 25, "경영학");
//        System.out.println(student.toString());
//
//        // 하위클래스에서 부모 클래스의 메서드 사용
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//
//        Cat cat = new Cat("고양이","냥냥이",3);
//        System.out.println("종 : "+ cat.getSpecies()+" 이름 : "+ cat.getName() + " 나이 : " + cat.getAge() +" 울음소리 : " + cat.MakeSound());
//        Dog dog = new Dog("강아지","댕댕이",4);
//        System.out.println("종 : "+ dog.getSpecies()+" 이름 : "+ dog.getName() + " 나이 : " + dog.getAge() +" 울음소리 : " + dog.MakeSound());

        Vehicle test = new Vehicle(4,"car",4);
        System.out.println(test.whom());
    }


}

package a0320;

public class Class5_1 {
    public static void main(String[] args) {
        // person1이라는 객체는 만들고 생성자에 "홍길동" 31을 넣어서 출력.
        Person person1 = new Person("홍길동", 31);

        System.out.println("이름: " + person1.name);
        System.out.println("나이: " + person1.age);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package object_oriented_programming;

public class Person {

    // properties of person  - variable
    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Rohit";
        person.age = 22;
        person.talk();

        Person person2 = new Person();
        person2.name = "Shubham";
        person2.age = 24;
        person2.talk();
    }

    // actions - methods
    void talk() {
        System.out.println("Hello " + name + " age " + age);
    }
}

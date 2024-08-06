package demoStatic;

public class DemoStatic {

    public static void main(String[] args) {

        Person p1 = new Person("Pierre");
        Person p2 = new Person("Pol");
        Person p3 = new Person("Jacques");
        Person.sayHello();
    }
}

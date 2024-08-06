package demoStatic;

public class Person {

    private static int nextId = 1;
    private int id;
    private String name;

    public Person(String name){
        this.id = nextId++;
        this.name = name;
    }

    public static void sayHello(){
        System.out.println("Hello world!!!");
    }

    public String getName() {
        return name;
    }
}

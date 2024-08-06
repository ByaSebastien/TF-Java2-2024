package demoInterfaceFonctionnelle;

import java.util.List;

public class DemoInterfaceFonctionnelle {
    public static void main(String[] args) {
        List<MyIF> myIFS = List.of(
                (name) -> System.out.println("Hello " + name),
                (name) -> System.out.println("Comment vas " + name + "?"),
                (name) -> System.out.println("Ciao " + name + "?"),
                (name) -> truc()
                );

        OtherClass.doStuff(myIFS);
    }

    private static void truc(){
        System.out.println("J'execute mon truc!!!");
    }
}

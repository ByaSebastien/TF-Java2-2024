package demoInterfaceFonctionnelle;

import java.util.List;

public class OtherClass {

    public static void doStuff(List<MyIF> ifs){
        for (MyIF myIF : ifs){
            myIF.execute("Roger");
        }
    }
}

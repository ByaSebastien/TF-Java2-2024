package demoGenerique;

import java.util.ArrayList;
import java.util.List;

public class DemoGenerique {

    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        list.ajouter(5);
        list.ajouter(10);
        list.ajouter(20);
        list.supprimer(20);
        System.out.println(list.rechercher(10));
    }
}

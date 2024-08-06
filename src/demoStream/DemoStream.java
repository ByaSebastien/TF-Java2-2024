package demoStream;

import java.util.ArrayList;
import java.util.List;

public class DemoStream {
    public static void main(String[] args) {

        List<Dog> dogs = List.of(
                new Dog("Zara","Bouvier bernois",17),
                new Dog("Luna","Shitzu",9),
                new Dog("Molly","Shitzu",8),
                new Dog("Malcko","Berger alemand",12)
        );

//        List<Dog> shitzus = new ArrayList<>();
//        for (Dog d : dogs) {
//            if(d.getRace().equals("Shitzu")){
//                shitzus.add(d);
//            }
//        }

        List<String> shitzus = dogs.stream()
                .filter(dog -> dog.getRace().equals("Shitzu"))
                .map(d -> d.getName())
                .limit(1)
                .toList();


        for(String d : shitzus){
            System.out.println(d);
        }
    }
}

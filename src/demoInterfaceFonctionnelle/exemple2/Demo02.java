package demoInterfaceFonctionnelle.exemple2;

import demoStatic.Person;

import java.util.List;

public class Demo02 {
    public static void main(String[] args) {

        Shop shop = new Shop();

        List<Person> persons = List.of(
                new Person("Pierre"),
                new Person("Pol"),
                new Person("Jacques")
        );

        for (Person person : persons) {
            shop.registerToNewsLetter(person);
        }

        shop.addArticle("Coton tige");
        shop.addArticle("Framboise");
        shop.removeArticle("Framboise");
    }
}

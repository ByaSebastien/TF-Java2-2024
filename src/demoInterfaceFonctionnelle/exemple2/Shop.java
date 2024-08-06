package demoInterfaceFonctionnelle.exemple2;

import demoInterfaceFonctionnelle.MyIF;
import demoStatic.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Shop {

    private List<String> article = new ArrayList<String>();

    private List<OtherIF> addEvent = new ArrayList<>();
    private List<OtherIF> removeEvent = new ArrayList<>();

    public void registerToNewsLetter(Person person) {
        System.out.println("Voulez vous etre avertis quand un nouvelle article arrive? y/n");
        boolean response = new Scanner(System.in).next().equals("y");
        if(response){
            addEvent.add(()-> System.out.println(person.getName() + " un vouvel article vient d'etre ajouter"));
        }
        System.out.println("Voulez vous etre avertis quand un article est retiré de la vente? y/n");
        response = new Scanner(System.in).next().equals("y");
        if(response){
            removeEvent.add(()-> System.out.println(person.getName() + " un vouvel article vient d'etre supprimer"));
        }

    }
    public void addArticle(String article) {
        this.article.add(article);
        triggerAddEvent();
    }

    public void removeArticle(String article) {
        this.article.remove(article);
        triggerRemoveEvent();
    }

    private void triggerAddEvent(){
        for(OtherIF event: addEvent){
            event.execute();
        }
    }

    private void triggerRemoveEvent(){
        for(OtherIF event: removeEvent){
            event.execute();
        }
    }
}

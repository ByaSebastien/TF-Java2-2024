package demoGenerique;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T> {

    List<T> list = new ArrayList<>();

    public void ajouter(T t) {
        list.add(t);
    }

    public void supprimer(T t) {
        list.remove(t);
    }

    public T rechercher(T t) {
        for(T i : list) {
            if(i == t) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
}

package at.campus02.bsd;

import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements DQueue {

    private DrinkElement first;
    private DrinkElement last;


    @Override
    public boolean offer(Drink obj) {
       if (first == null) {
           first = new DrinkElement(obj);
           last = first;
       }else if (last == first) {
           last = new DrinkElement(obj);
       }else {
           last.hasNext = new DrinkElement(obj);
       }
       return true;
    }

    @Override
    public Drink poll() {
        if (first == null) {return null;}
        //remove element
        return first.getDrink;
    }

    @Override
    public Drink remove() {
        if (first == null) {throw new NoSuchElementException();}
        //remove element
        return first.getDrink;
    }

    @Override
    public Drink peek() {
        if (first == null) {return null;}
        return first.getDrink;
    }

    @Override
    public Drink element() {
        if (first == null) {throw new NoSuchElementException();}
        return first.getDrink;
    }
    
}

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
        if (first == null) {return null;}           // If empty return null
        DrinkElement return_element = this.first;   // Get element to be returned in buffer
        this.first = return_element.getNext();      // Get new first element
        this.first.setPrevious(null);      // and set it as the first
        return return_element.getDrink();           // Return drink from old first element
    }

    @Override
    public Drink remove() {
        if (first == null) {throw new NoSuchElementException();}
        //remove element
        return first.getDrink;
    }

    @Override
    public Drink peek() {
        return this.first.getDrink();
    }

    @Override
    public Drink element() {
        if (first == null) {throw new NoSuchElementException();}
        return first.getDrink;
    }
    
}

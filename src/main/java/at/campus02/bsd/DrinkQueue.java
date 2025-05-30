package at.campus02.bsd;

import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements DQueue {

    private DrinkElement first;
    private DrinkElement last;


    @Override
    public boolean offer(Drink obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'offer'");
    }

    @Override
    public Drink poll() {
        if (first == null) {return null;}
        return first;
    }

    @Override
    public Drink remove() {
        if (first == null) {throw new NoSuchElementException();}
        return first;
    }

    @Override
    public Drink peek() {
        if (first == null) {return null;}
        return first;
    }

    @Override
    public Drink element() {
        if (first == null) {throw new NoSuchElementException();}
        return first;
    }
    
}

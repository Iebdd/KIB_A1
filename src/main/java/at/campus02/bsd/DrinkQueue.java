package at.campus02.bsd;

import java.util.NoSuchElementException;

/**
 * offers the basic methods to add and remove drinks
 * implements Dqueue
 */
public class DrinkQueue implements DQueue {

    private DrinkElement first;
    private DrinkElement last;


    @Override
    public boolean offer(Drink obj) {
       if (first == null) {
           first = new DrinkElement(obj);
           last = first;
       }else if (last == first) {
           this.last = new DrinkElement(obj);
           first.setNext(this.last);
           last.setPrevious(this.first);
       }else {
           DrinkElement old_last = this.last;
           this.last = new DrinkElement(obj);
           old_last.setNext(this.last);
           this.last.setPrevious(old_last);
       }
       return true;
    }

    /**
     * del 1st element
     * @return 1st element; null if nothing in there
     */
    @Override
    public Drink poll() {
        if (first == null) {return null;}           // If empty return null
        DrinkElement return_element = this.first;   // Get element to be returned in buffer
        this.first = return_element.getNext();// Get new first element
        if (this.first==null){
            last = first;
            return return_element.getDrink();
        }
        this.first.setPrevious(null);      // and set it as the first
        return return_element.getDrink();           // Return drink from old first element
    }

    /**
     same as poll, if there is nothing in there error NoSuchElementException
     */
    @Override
    public Drink remove() throws NoSuchElementException {
        if (first == null) {throw new NoSuchElementException();}
        DrinkElement return_element = this.first;
        this.first = return_element.getNext();
        this.first.setPrevious(null);
        return return_element.getDrink();
    }
    /**
     * @return 1st element without delete, otherwise null
     */
    @Override
    public Drink peek() {
        return this.first.getDrink();
    }

    /**
     same as peek, if there is nothing in there error NoSuchElementException
     */
    @Override
    public Drink element() throws NoSuchElementException {
        if (first == null) {throw new NoSuchElementException();}
        return first.getDrink();
    }
    
}

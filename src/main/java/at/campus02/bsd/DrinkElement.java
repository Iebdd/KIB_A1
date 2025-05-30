package at.campus02.bsd;

/**
 * saves the previous and next element of the given drink in the queue
 */
public class DrinkElement {
    private final Drink drink;
    private DrinkElement previous;
    private DrinkElement next;

    public DrinkElement(Drink drink) {
        this.drink = drink;
        this.previous = null;
        this.next = null;
    }

    public DrinkElement(Drink drink, DrinkElement previous, DrinkElement next) {
        this.drink = drink;
        this.previous = previous;
        this.next = next;
    }

    public boolean hasNext() {
        return (this.next != null);
    }

    public boolean hasPrevious() {
        return (this.previous != null);
    }

    public DrinkElement getNext() throws NullPointerException {
        return this.next;
    }

    public DrinkElement getPrevious() throws NullPointerException {
        return this.previous;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public void setPrevious(DrinkElement previous) {
        this.previous = previous;
    }

    public void setNext(DrinkElement next) {
        this.next = next;
    }
    
}

package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    //Creates simple drinks
    private Drink createDrink(String name) {
        return new SimpleDrink(name, new Liquid(name, 0.5, 0.0));
    }

    @Test
    public void testOfferSingleElement() {
        DrinkQueue queue = new DrinkQueue();
        Drink d1 = createDrink("Cola");

        assertTrue(queue.offer(d1));
        assertEquals(d1, queue.peek());
    }

    @Test
    public void testOfferTwoElements() {
        DrinkQueue queue = new DrinkQueue();
        Drink d1 = createDrink("Cola");
        Drink d2 = createDrink("Fanta");

        queue.offer(d1);
        queue.offer(d2);

        assertEquals(d1, queue.peek());
        assertEquals(d1, queue.poll());
        assertEquals(d2, queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testPollFromEmptyQueue() {
        DrinkQueue queue = new DrinkQueue();
        assertNull(queue.poll());
    }

    @Test
    public void testRemoveFromEmptyQueue() {
        DrinkQueue queue = new DrinkQueue();
        assertThrows(NoSuchElementException.class, queue::remove);
    }

    @Test
    public void testElementFromEmptyQueue() {
        DrinkQueue queue = new DrinkQueue();
        assertThrows(NoSuchElementException.class, queue::element);
    }

    @Test
    public void testInternalLinking() {
        DrinkQueue queue = new DrinkQueue();
        Drink d1 = createDrink("Coke");
        Drink d2 = createDrink("Sprite");
        Drink d3 = createDrink("Pepsi");

        queue.offer(d1);
        queue.offer(d2);
        queue.offer(d3);

        assertEquals(d1, queue.poll());
        assertEquals(d2, queue.poll());
        assertEquals(d3, queue.poll());
    }

    @Test
    public void testPeekDoesNotRemove() {
        DrinkQueue queue = new DrinkQueue();
        Drink d = createDrink("Fanta");
        queue.offer(d);
        assertEquals(d, queue.peek());
        assertEquals(d, queue.peek());
        assertEquals(d, queue.poll());
    }

    @Test
    public void testAddNullDrink() {
        DrinkQueue queue = new DrinkQueue();
        assertThrows(NullPointerException.class, () -> queue.offer(null));
    }
}

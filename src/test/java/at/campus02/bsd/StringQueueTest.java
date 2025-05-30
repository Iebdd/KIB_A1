package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(2);
    }

    @Test
    public void testOfferBelowMaxSize() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
    }

    @Test
    public void testOfferAtMaxSizeReturnsFalse() {
        queue.offer("A");
        queue.offer("B");
        assertFalse(queue.offer("C"));
    }

    @Test
    public void testPollReturnsAndRemovesFirstElement() {
        queue.offer("X");
        queue.offer("Y");

        assertEquals("X", queue.poll());
        assertEquals("Y", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testRemoveReturnsAndRemovesFirstElement() {
        queue.offer("Z");
        assertEquals("Z", queue.remove());
    }

    @Test
    public void testRemoveThrowsIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testPeekReturnsFirstWithoutRemoving() {
        queue.offer("Hello");
        assertEquals("Hello", queue.peek());
        assertEquals("Hello", queue.peek());
    }

    @Test
    public void testPeekReturnsNullIfEmpty() {
        assertNull(queue.peek());
    }

    @Test
    public void testElementReturnsFirstWithoutRemoving() {
        queue.offer("World");
        assertEquals("World", queue.element());
    }

    @Test
    public void testElementThrowsIfEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}

package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class impliments IQueue
 * Logic for simple queue methods
 */
public class StringQueue implements IQueue {

  /**
   * elements contains all elements in an Arraylist
   */
  private List<String> elements = new ArrayList<String>();
  /**
   * maxSize defines the maximum size of the queue
   */
  private final int maxSize;

  /**
   * Initilizes object and defines size
   * @param maxsize
   */
  public StringQueue(int maxsize) {
    this.maxSize = maxsize;
  }

  /**
   * Adds a String to the queue if the max size is not reached
   * @param obj String to be added to the queue
   * @return boolean if the Object is added returns true
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize){
      elements.add(obj);
      return true;
    }
    return false;
  }

  /**
   * Gets and removes first object in queue
   * @return String or null if the queue is empty
   */
  @Override
  public String poll() {
    String element = peek();

    if (!elements.isEmpty()) {
      elements.remove(element);
    }

    return element;
  }

  /**
   * Removes the first element
   * throws an Exeption if there is no element
   * @return String or null if there is no element
   */
  @Override
  public String remove() {
    String element = poll();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Gets first object without removing it
   * @return String or null if queue is empty
   */
  @Override
  public String peek() {
    String element = null;

    if (elements.size() > 0){
      element = elements.getFirst();
    }
    return element;
  }

  /**
   *
   * @return String or null if there is no element
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}
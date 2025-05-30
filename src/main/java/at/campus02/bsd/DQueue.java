package at.campus02.bsd;

/**
 * interface for String queue
 * Method headers for simple queue operation
 */
public interface DQueue {

  public abstract boolean offer(Drink obj);

  /**
   * del 1st element
   * @return 1st element; null if nothing in there
   */
  public abstract Drink poll();

  /**
   same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract Drink remove();

  /**
   * @return 1st element without delete, otherwise null
   */
  public abstract Drink peek();

  /**
   same as peek, if there is nothing in there error NoSuchElementException
   */
  public abstract Drink element();
}
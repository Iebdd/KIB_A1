package at.campus02.bsd;

/**
 * interface for String queue
 * Method headers for simple queue operation
 */
public interface IQueue {

  public abstract boolean offer(String obj);

  /**
   * del 1st element
   * @return 1st element; null if nothing in there
   */
  public abstract String poll();

  /**
  same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract String remove();

  /**
   * @return 1st element without delete, otherwise null
   */
  public abstract String peek();
  /**
   same as peek, if there is nothing in there error NoSuchElementException
   */
  public abstract String element();
}
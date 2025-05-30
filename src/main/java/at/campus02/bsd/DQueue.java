package at.campus02.bsd;

// fastly written (not really nice) comments you should adapt
public interface BQueue {
  /** 
   * I am a really bad comment
   * 
   * fasdfadsffdsadsf
   * 
   * fdsasdfadsf
   * 
   *  add object to queue, true if okay 
   * 
   * i fell asleep on my keyboard...
   * 
   * */ 
  public abstract boolean offer(Drink obj);

  //returns + del 1st element; null if nothing in there
  public abstract Drink poll();

  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract Drink remove();

  // 1st element without delete, otherwise null
  public abstract Drink peek();

  // element is to peek what remove is to poll
  public abstract Drink element();
}
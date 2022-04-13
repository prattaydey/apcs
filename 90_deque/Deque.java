// Team Spanish Inquisition : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent: 0.5hr

/*
DISCOS:
- In a deque, you can both enqueue and dequeue at either end.
- Many of dequeue's methods have a version that throws an exception when the list is empty, while the other returns null.

QCCs:
- If a deque can both enqueue and dequeue at either end, how is still considered a "queue" considering it does not follow FIFO?
*/


public interface Deque<E>
{
  // add methods
  public void addFirst(E e);

  public void addLast(E e);

  // remove methods
  public E removeFirst();

  public E removeLast();

  // peek methods
  public E peekFirst();

  public E peekLast();

  // other methods
  public boolean isEmpty();

  public int size();
}

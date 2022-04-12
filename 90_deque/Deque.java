// Team Spanish Inquisition : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW90 -- Queue Two Ways
// 2022-04-11
// time spent: 0.5 hr

public interface Dequeue<E>
{
  public void addFirst(E e);

  public void addLast(E e);

  public E removeFirst();

  public E removeLast();

  public E peekFirst();

  public E peekLast();
}

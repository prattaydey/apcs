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


import java.util.LinkedList;

public class QQKachoo<E> implements Deque<E>
{
  private LinkedList<E> ll;

  // constructor
  public QQKachoo(){
    ll = new LinkedList<E>();
  }


  // add methods
  public void addFirst(E e){
    ll.addFirst(e);
  }

  public void addLast(E e){
    ll.addLast(e);
  }


  // remove methods
  public E removeFirst(){
    return ll.removeFirst();
  }

  public E removeLast(){
    return ll.removeLast();
  }


  // peek methods
  public E peekFirst(){
    if ( !isEmpty() ){
      return ll.peekFirst();
    }
    else { return null; }
  }

  public E peekLast(){
    if ( !isEmpty() ){
      return ll.peekLast();
    }
    else { return null; }
  }


  // other methods
  public boolean isEmpty(){
    return size() == 0;
  }

  public int size(){ return ll.size(); }

}

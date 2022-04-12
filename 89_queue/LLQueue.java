// Team Spanish Inquisition : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW89 -- Queue Two Ways
// 2022-04-11
// time spent: 0.5 hr

/*
  DISCOS:
  - Both enqueue and dequeue for LLQueue run on constant tiem.
  - For ALQueue either dequeue or enqueue will have O(n) runtime while the other has O(1) runtime.
    This is b/c we have to shift elements accordingly.

  QCCs:
  - Is there a way to have both enqueue and dequeue for ALQueue to run on constant time?
  - What is the difference betweem getFirst() and peekFirst() for Linked List fucntionality? They seem to do the same purpose in the Oracle docs.
*/

import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue<QUASAR>
{
  private LinkedList<QUASAR> ll;

  public LLQueue()
  {
    ll = new LinkedList<QUASAR>();
  }


  public void enqueue(QUASAR x){
    ll.addLast(x);
  } // O(1)

  public QUASAR dequeue(){
    return ll.remove();
  } // O(1)

  public boolean isEmpty() { return ll.size() == 0; } // O(1)

  public QUASAR peekFront() { return ll.peekFirst(); } // O(1)

} // end LLQueue class

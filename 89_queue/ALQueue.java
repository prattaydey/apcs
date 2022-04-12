// Team Spanish Inquisition : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW89 -- Queue Two Ways
// 2022-04-11
// time spent: 0.5 hr

/*
  DISCOS:
  - Both enqueue and dequeue for LLQueue run on constant tiem.
  - Depending on where you define the front and the end for ALQueue, either dequeue or enqueue will have O(n) runtime while the other has O(1) runtime.
    This is b/c we have to shift elements accordingly.

  QCCs:
  - Is there a way to have both enqueue and dequeue for ALQueue to run on constant time?
  - What is the difference between getFirst() and peekFirst() for Linked List fucntionality? They seem to do the same purpose in the Oracle docs.
*/

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR>
{
  private ArrayList<QUASAR> al;

  public ALQueue()
  {
    al = new ArrayList<QUASAR>();
  }

  public void enqueue(QUASAR x){
    al.add(x);
  } // O(1)

  public QUASAR dequeue(){
    if ( !al.isEmpty() ){
      return al.remove(0);
    }

    else { return null; }
  } //O(n)


  public boolean isEmpty() { return al.isEmpty(); } // O(1)

  public QUASAR peekFront() {
    if ( !al.isEmpty() ){
      return al.get(0);
    }
    else { return null; }
  } // O(1)

} // end ALQueue class

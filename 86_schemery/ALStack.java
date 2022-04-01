// Team 2ndAve : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW85 -- Leon Leonwood Stack
// 2022-03-30
// time spent: 1.0 hrs

/***
    DISCO
    - We no longer need an isFull() method as an ArrayList and LinkedList do not have a set size.
    - Once again all the methods are still running in constant time O(1)

    QCC
    - Which is better ALStack or LLStack?
    Since they both have the same runtime complexity, would it be the same?

 **/

import java.util.ArrayList;

public class ALStack<T> implements Stack<T>
{
  private ArrayList<T> _stack;
  private int _stackSize;


  //constructor
  public ALStack()
  {
    _stack = new ArrayList<T>();
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( T s )
  {
    _stack.add(s);
    _stackSize++;
  }// O(1)


  //means of removal
  public T pop( )
  {
    if ( !isEmpty() ){
      _stackSize--;
      return _stack.get(_stackSize);
    }
    return null;
  }// O(1)


  public T peekTop(){ // returns the top of the stack
    if ( !isEmpty() ){
      return _stack.get(_stackSize - 1);
    }
    return null;
  }

  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)

}//end class ALStack

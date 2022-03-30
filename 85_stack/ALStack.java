
/***
    DISCO
    - Similar to the plate dispenser analogy, the most recently washed plates would be at the top. In this case, the most recently added elements would be at the end.
      That is why we defined the "top" as the end of the stack.

    QCC
    - When would we use stacks over other array/list types?
      The fact that we can only push to the end of the stack seems inconvenient compared to something such as ArrayLists, where we can add at index.

 **/

import java.util.ArrayList;

public class ALStack<T>
{
  private ArrayList<T> _stack;
  private int _stackSize;


  //constructor
  public ALStack( int initCapacity )
  {
    _stack = new ArrayList<T>();
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( T s )
  {
    if ( !isFull() ){
      _stack.add(s);
      _stackSize++;
    }
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
      return _stack[_stackSize - 1];
    }
    return null;
  }

  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {

    ALStack tastyStack = new ALStack(12); // originally 10, fixed to 12 to account for all pushes

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes

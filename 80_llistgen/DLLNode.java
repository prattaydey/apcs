// Team McDonalds$24MScam: Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW80 -- Generic Lists
// 2022-03-24
// time spent: 1.0 hr
// KtS consumed: 2

/*
DISCOS:
- Find and replace is a very helpful tool but you have to be careful not to replace the wrong occurences
- When calling a generic class, you have to include the specific type for that Object

QCCs:
- IS there an easier way to implement a generic class without having to include type in every occurence.

/***
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 * Stores a String as cargo.
 **/

public class DLLNode<Type>
{
  private Type _cargo;
  private DLLNode<Type> _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( Type value, DLLNode<Type> prev, DLLNode<Type> next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public Type getCargo() { return _cargo; }

  public DLLNode<Type> getNext() { return _nextNode; }

  public DLLNode<Type> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public Type setCargo( Type newCargo )
  {
    Type foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<Type> setNext( DLLNode<Type> newNext )
  {
    DLLNode<Type> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<Type> setPrev( DLLNode<Type> newPrev )
  {
    DLLNode<Type> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode first = new DLLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null ) );

    DLLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode

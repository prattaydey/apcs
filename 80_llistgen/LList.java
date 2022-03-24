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
 * class LList v3
 * Implements a linked list of DLLNodes, each containing String data
 **/

public class LList<Type> implements List<Type> //your List.java must be in same dir
{

  //instance vars
  private DLLNode<Type> _head, _tail; //pointers to first and last nodes
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = _tail = null; //at birth, a list has no elements
    _size = 0;
  }// Team McDonalds$24MScam: Prattay Dey, Joshua Gao, Faiza Huda
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


  //--------------v  List interface methods  v--------------

  //add a node to end of list
  public boolean add( Type newVal )
  {
    addLast( newVal );
    return true; //per Java API spec
  }


  //insert a node containing newVal at position index
  public void add( int index, Type newVal )
  {
    if ( index < 0 || index > size() )
      throw new IndexOutOfBoundsException();

    else if ( index == size() )
      addLast( newVal );

    DLLNode<Type> newNode = new DLLNode<Type>( newVal, null, null );

    //if index==0, insert node before head node
    if ( index == 0 )
      addFirst( newVal );
    else {
      DLLNode<Type> tmp1 = _head; //create alias to head

      //walk tmp1 to node before desired node
      for( int i=0; i < index-1; i++ )
        tmp1 = tmp1.getNext();

      //init a pointer to node at insertion index
      DLLNode<Type> tmp2 = tmp1.getNext();

      //insert new node
      newNode.setNext( tmp2 );
      newNode.setPrev( tmp1 );
      tmp1.setNext( newNode );
      tmp2.setPrev( newNode );

      //increment size attribute
      _size++;
    }
  }//end add-at-index


  //remove node at pos index, return its cargo
  public Type remove( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    if ( index == 0 )
      return removeFirst();
    else if ( index == size()-1 )
      return removeLast();
    else {
      DLLNode<Type> tmp1 = _head; //create alias to head

      //walk to node before desired node
      for( int i=0; i < index-1; i++ ) {
        tmp1 = tmp1.getNext();
        System.out.println( "tmp1: " + tmp1.getCargo() );
      }
      //check target node's cargo hold
      Type retVal = tmp1.getNext().getCargo();

      //remove target node
      tmp1.setNext( tmp1.getNext().getNext() );
      System.out.println( "tmp1.getNext: " + tmp1.getNext().getCargo() );
      tmp1.getNext().setPrev( tmp1 );

      _size--;

      return retVal;
    }
  }


  public Type get( int index )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    Type retVal;
    DLLNode<Type> tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public Type set( int index, Type newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode<Type> tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //storeLList.java:118: error: name clash: set(int,Type) in LList and set(int,Object) in List have the same erasure, yet neither overrides the other
 //target nodes cargo
    Type oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  //--------------v  Helper methods  v--------------

  public void addFirst( Type newFirstVal )
  {
    //insert new node before first node (prev=null, next=_head)
    _head = new DLLNode<Type>( newFirstVal, null, _head );

    if ( _size == 0 )
      _tail = _head;
    else
      _head.getNext().setPrev( _head );
    _size++;
  }


  public void addLast( Type newLastVal )
  {
    //insert new node after last node (prev=_last, next=null)
    _tail = new DLLNode<Type>( newLastVal, _tail, null );

    if ( _size == 0 )
      _head = _tail;
    else
      _tail.getPrev().setNext( _tail );
    _size++;
  }


  public Type getFirst() { return _head.getCargo(); }

  public Type getLast() { return _tail.getCargo(); }


  public Type removeFirst()
  {
    Type retVal = getFirst();
    if ( size() == 1 ) {
      _head = _tail = null;
    }
    else {
      _head = _head.getNext();
      _head.setPrev( null );
    }
    _size--;
    return retVal;
  }

  public Type removeLast()
  {
    Type retVal = getLast();
    if ( size() == 1 ) {
      _head = _tail = null;
    }
    else {
      _tail = _tail.getPrev();
      _tail.setNext( null );
    }
    _size--;
    return retVal;
  }
  //--------------^  Helper methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    DLLNode<Type> tmp = _head; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + "->";
      tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println("initially: " );
    System.out.println( james + "\tsize: " + james.size() );

    james.add("beat");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("a");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("need");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("I");
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james + "\tsize: " + james.size() );

    james.add(0,"whut");
    System.out.println( "...after add(0,whut): " );
    System.out.println( james + "\tsize: " + james.size() );

    james.add(4,"phat");
    System.out.println( "...after add(4,phat): " );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove last: "
                        + james.remove( james._size-1) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );
  }//end main()

}//end class LList

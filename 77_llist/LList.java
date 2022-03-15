// Team McDonalds$24MScam: Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW77 -- Insert & Remove
// 2022-03-15
// time spent: ____ hrs


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList()
  {
    _head = new LLNode(null,null); //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode temp = _head;
    // if node is empty, simply put the cargo there
    if (temp.getCargo() == null){
      temp.setCargo(newVal);
      _size++;
    }
    // else traverse the LL until you reach the end, append a new node with newVal as its cargo
    else{
      for (int i = 1; i < size(); i++){
        temp = temp.getNext();
      }
      temp.setNext(new LLNode(newVal, null));
      _size++;
    }
    return true;
  }


  public void add(int index,String newVal){
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head;
    _size++;

    // adds every value before index to the new LL
    for ( int i = 0; i < index; i++){
      tmp.setCargo(_head.getCargo());
      _head.getNext();
      tmp.getNext();
    }

    tmp.setCargo(newVal); // adds newValue itself
    tmp.getNext();

    // adds every value after index, shifted 1 right from its original pos in _head
    for (  int i = index + 1; i < _size; i++ ){
      tmp.setCargo(_head.getCargo());
      _head.getNext();
      tmp.getNext();
    }
  }


  public String remove( int index ){
    return "0";
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
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

    //System.out.println( james );
    //System.out.println( "size: " + james.size() );

    james.add("beat");
    //System.out.println( james );
    //System.out.println( "size: " + james.size() );

    james.add("a");
    //System.out.println( james );
    //System.out.println( "size: " + james.size() );

    james.add("need");
    //System.out.println( james );
    //System.out.println( "size: " + james.size() );

    james.add("I");
    //System.out.println( james );
    //System.out.println( "size: " + james.size() );

    //System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    //System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    james.add(3,"want");
    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


  }

}//end class LList

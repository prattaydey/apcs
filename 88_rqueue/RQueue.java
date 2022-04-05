// Team Spanish Inquisition : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW88 -- BPC Kiddies Do Not Wait in Line Either
// 2022-04-04
// time spent: 1.0 hr

/*
  DISCOS:
  - We can set two variables equal to the same value on one line
  - We can shuffle the queue by randomly dequeuing a node, and then enqueuing it back at the front and repeating this for entire queue.

  QCCs:
  - Is there an implementation of sample() that has a better runtime than O(n^2)?
  
/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    LLNode<SWASHBUCKLE> tmp = new LLNode(enQVal, null);
    if (_size == 0){
      _front = _end = tmp;
    }
    else{
      _end.setNext( tmp );
      _end = tmp;
    }
    _size++;

  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE retVal;
    if (_size == 1){
      retVal = _front.getCargo();
      _front = _end = null;
    }

    else{
      int random = (int) ( Math.random() * _size); // random node within the Queue
      LLNode<SWASHBUCKLE> tmp = _front;
      for (int i = 0; i < random - 1; i++){
        tmp = tmp.getNext();
      }

      retVal = tmp.getNext().getCargo();
      tmp.setNext( tmp.getNext().getNext() );
      _size--;

    }
    return retVal;
  }//O(n)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   Dequeue a random node using Math.random()
       Take that return value, and requeue it at the front
       Do this _size - 1 times to ensure all nodes have been addressed
   **/
  public void sample()
  {
    for (int i = 0; i < _size; i++){
      this.enqueue( this.dequeue() );
    }
  }//O(n^2)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {
    LLNode<SWASHBUCKLE> tmp = _front;
    String result = "FRONT --> ";
    for (int i = 0; i < _size; i++){
      result += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    result += "<-- END";
    return result;
  }//end toString()

  public class LLNode<SWASHBUCKLE>
  {
    //instance vars
    private SWASHBUCKLE cargo;
    private LLNode<SWASHBUCKLE> node;

    // constructor
    public LLNode( SWASHBUCKLE value, LLNode<SWASHBUCKLE> next )
    {
      cargo = value;
      node = next;
    }


    //--------------v  ACCESSORS  v--------------
    public SWASHBUCKLE getCargo()
    {
      return cargo;
    }

    public LLNode<SWASHBUCKLE> getNext()
    {
      return node;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo )
    {
      SWASHBUCKLE temp = cargo;
      cargo = newCargo;
      return temp;
    }

    public LLNode setNext( LLNode<SWASHBUCKLE> newNext )
    {
      LLNode<SWASHBUCKLE> temp = node;
      node = newNext;
      return temp;
    }
  }


  //main method for testing
  public static void main( String[] args )
  {


    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main


}//end class RQueue

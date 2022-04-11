public class LLQueue<QUASAR> implements Queue<QUASAR>
{
  private LLNode _front;
  private LLNode _back;
  private int _size;

  public LLQueue()
  {
    _head = _back = null;
    _size = 0;
  }

  public boolean isEmpty() { return _size == 0; }

  public QUASAR peekFront() { return _front.getCargo();}

  public void enqueue(QUASAR x)
  {
    LLNode tmp = new LLNode(x, null);
    _back.setNext(tmp);
    _back = tmp;
  }

  public QUASAR dequeue(){
    QUASAR retVal = _front.getCargo();
    _front = _front.getNext();
    return retVal;
  }
}

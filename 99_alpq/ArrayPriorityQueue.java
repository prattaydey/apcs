import java.util.ArrayList;

public class ArrayPriorityQueue
{
  private ArrayList<Integer> _data;

  public ArrayPriorityQueue()
  {
    _data = new ArrayList<Integer>();
  }


    public void add( int x ){
      _data.add(x);
    }

    public boolean isEmpty(){
      return _data.size() == 0;
    }

    public int peekMin(){
      int min = 0;
      for (int i = 1; i < _data.size(); i++){
        if (_data.get(i) < _data.get(min)){ min = i; }
      }
      return _data.get(min);
    }

    public int removeMin(){
      return _data.remove( peekMin() );
    }

    public static void main(String[] args){
      ArrayPriorityQueue test = new ArrayPriorityQueue();

      for (int i = 0; i < 10; i++){
        int random = (int) ( Math.random() * 20 );
        test.add(random);
      }

      System.out.println( test.isEmpty() ); // false

      while ( !test.isEmpty() ){
        System.out.println( "Peeking min: " + test.peekMin() );
        System.out.println( "Removing min: " + test.removeMin() );
        System.out.println("-------------------------");
      }



    }
}

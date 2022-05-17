// Team Mamba: Nafiz Labib, Kartik Vanjani, Prattay Dey
// APCS pd8
// HW99 -- Some Are More Equal Than Others, Codified
// 2022-05-13f
// time spent: 0.5 hrs + classtime

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
        if ( _data.get(min) > _data.get(i) ){
          min = i;
        }
      }
      return _data.get(min);
    }

    public int removeMin(){
      // finds the min value, finds its index in the queue, then removes that index
      return _data.remove( _data.indexOf( peekMin() ) );
    }



    public static void main(String[] args){
      ArrayPriorityQueue test = new ArrayPriorityQueue();

      test.add(4);
      test.add(7);
      test.add(43);
      test.add(0);
      test.add(22);
      test.add(-1);
      test.add(9);

      System.out.println( test.isEmpty() ); // false

      while ( !test.isEmpty() ){
        System.out.println( "Peeking min: " + test.peekMin() );
        System.out.println( "Removing min: " + test.removeMin() );
        System.out.println("-------------------------");
      }



    }
}

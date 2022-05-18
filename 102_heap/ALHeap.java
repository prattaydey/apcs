// Team Mamba: Nafiz Labib, Kartik Vanjani, Prattay Dey
// APCS pd8
// HW102 -- Heap On Heapin' On
// 2022-05-17t
// time spent: 1.0 hr + classtime

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    String output = "";
    for(int i : _heap) {
      output = output + i + " ";
    }
    return output;
  }//O(?)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0); // root of min heap is always min value
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * Add val as leaf
   * Compare val to its parent
   * if val is greater than parent, have reached correct position in heap
   * else, swap val and parent and repeat previous step with val's new parent.
   */
  public void add( Integer addVal )
  {
    int index = _heap.size(); // index of addVal
    _heap.add(addVal); // adds at end, as a leaf
    while (index > -1){ //while there are still levels above
      int parent = (index - 1) / 2;
      if (addVal >= _heap.get(parent)) { break; } // correct index, heap order is now maintained
      else{
        swap(index, parent); // else, keep moving added value up
      }
    }
  }//O(logn)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * peek root of heap (always min value in min heap)
   * swap root and leaf (first and last indices)
   * remove old root (now on the last index)
   * If new root is not less than both of its children, swap with child w/ least value
   * Repeat until new root is less than both it's children, or has reached bottom of tree and become a leaf
   */
  public Integer removeMin()
  {
    int minVal = _heap.get(0); // saves original root to return later
    swap(0, _heap.size() - 1);
    _heap.remove( _heap.size() - 1 ); // removes original root

    int currIndex = 0;
    int lChild = (2 * currIndex) + 1;
    int rChild = lChild + 1;

    while (currIndex < _heap.size() ){
      if (lChild < _heap.size() && rChild < _heap.size() ){ // if it has two children
        if (_heap.get(currIndex) < _heap.get(lChild) && _heap.get(currIndex) < _heap.get(rChild) ){
          return minVal;
        }
        else{
          int tmp = minChildPos(currIndex);
          swap(currIndex, minChildPos(currIndex));
          currIndex = tmp;
        }
      }
      else if (lChild < _heap.size() ){ // if it only has left child
        if (_heap.get(currIndex) < _heap.get(lChild)){ return minVal; }
        else{
          int tmp = lChild;
          swap(currIndex, lChild);
          currIndex = tmp;
        }
      }
      else if (rChild < _heap.size()){ // if it has only right child
        if (_heap.get(currIndex) < _heap.get(rChild)){ return minVal; }
        else{
          int tmp = rChild;
          swap(currIndex, rChild);
          currIndex = tmp;
        }
      }
      else{ return minVal; } // if it has no children
    }
    return minVal;
  }//O(log n)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    int lChild = (2 * pos) + 1;
    int rChild = lChild + 1;

    if (lChild < _heap.size() && rChild < _heap.size() ){ // if there are 2 children
      if (_heap.get(lChild) < _heap.get(rChild)){
        return lChild;
      }
      else { return rChild; }
    }

    else if (lChild < _heap.size() ){ // if only left child exists
      return lChild;
    }
    else if (rChild < _heap.size() ){ // if only right child exists
      return rChild;
    }

    else { return -1; } // if it is a leaf
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap

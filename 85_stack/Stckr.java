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

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    // Stack<Object> cakes = new ALStack<Object>();
    Stack<Object> cakes = new LLStack<Object>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

    cakes.push("monke");
    cakes.push(3);
    cakes.push("banana");
    cakes.push(3.5);
    cakes.push('y');
    cakes.push("gorilla");
    cakes.push("big");

    System.out.println( "Is empty?: " + cakes.isEmpty() );
    while ( !cakes.isEmpty()){
      System.out.println( "peek: " + cakes.peekTop() );
      System.out.println( "pop: " + cakes.pop() );
    }
    System.out.println( "Is empty?: " + cakes.isEmpty() );

  }//end main

}//end class

/***
Monke: Prattay Dey + Winnie, Jeffery Tang + Mathias
APCS
HW24 -- Coin Flip with While
2021-10-25
time spent: 1.0 hr
 ***/

/*
DISCOS:
- The symbol "!" before a boolean statement would be similar to "not" in English. It executes the body as long as the conditional is NOT met. 

QCC:
- Is there a way we can write the function so that it requires less parameters?
- Could there be a similar function that takes n number of coins instead of just 2?
*/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
    //===================TOP==========================
      /*Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }*/
      Coin hello = new Coin("penny");
      Coin world = new Coin("dime");
      flipWhile(50, 70000, 2005, hello, world);
      //====================BOTTOM======================

  }//end main()
  public static void flipWhile(int x, int y, int z, Coin m, Coin n) {
    int matchCtr = 0;
    m.reset ("heads", 0.5);
    n.reset ("heads", 0.5);
    while (!(m.headsCtr + n.headsCtr > x && matchCtr > y && matchCtr > 65536 && matchCtr%z == 0)) {
      m.flip();
      n.flip();
      if (m.equals(n)) {
        matchCtr += 1;
      }
      else {
        matchCtr = matchCtr;
      }
    }
    System.out.println("Number of flips: ");
    System.out.println(hello.getflipCtr());
    System.out.println("Number of heads for the first coin: ");
    System.out.println(hello.getHeadsCtr());
    System.out.println("Number of heads for the second coin: ");
    System.out.println(world.getHeadsCtr());
    System.out.println("Total number of heads: ");
    System.out.println(hello.getHeadsCtr() + world.getHeadsCtr());
    System.out.println("Number of matches: ");
    System.out.println(matchCtr);
  }
}//end class

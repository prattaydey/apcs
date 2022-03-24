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
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    //instantiate... var type List, obj type LList
    List<String> wu = new LList<String>();

    System.out.println(wu);
    wu.add("RZA");

    System.out.println(wu);
    wu.add("GZA");

    System.out.println(wu);
    wu.add("ODB");

    System.out.println(wu);
    wu.add("Inspectah Deck");

    System.out.println(wu);
    wu.add("Raekwon the Chef");

    System.out.println(wu);
    wu.add("U-God");

    System.out.println(wu);
    wu.add("Ghostface");

    System.out.println(wu);
    wu.add("Method Man");

    System.out.println(wu);

    for( int i=0; i<7; i++ ) {
      int n = (int)( wu.size() * Math.random() );
      String imposter = "@";
      System.out.println("adding imposter at index " + n + "...");
      wu.add( n, imposter );
      System.out.println("Updated list: " + wu);
    }

    while( wu.size() > 0 ) {
      int n = (int)( wu.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      wu.remove(n);
      System.out.println("Updated list: " + wu);
    }


    List<Integer> zu = new LList<Integer>();

    System.out.println(zu);
    zu.add(1);

    System.out.println(zu);
    zu.add(2);

    System.out.println(zu);
    zu.add(3);

    System.out.println(zu);
    zu.add(4);

    System.out.println(zu);
    zu.add(5);

    System.out.println(zu);
    zu.add(6);

    System.out.println(zu);
    zu.add(7);

    System.out.println(zu);
    zu.add(8);

    System.out.println(zu);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class

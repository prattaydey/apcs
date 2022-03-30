// Team McDonalds$24MScam : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW84 -- Stack: What is it Good For?
// 2022-03-29
// time spent: .5 hrs

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes( s.length() );
    String result = "";
    for (int i = 0; i < s.length(); i++){
      stack.push( s.substring(i, i + 1) );
    }
    while ( !stack.isEmpty() ){
      result += stack.pop();
    }
    return result;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    final String opening = "{([";

    Latkes stackOpen = new Latkes( s.length() );

    for(int i = 0; i < s.length(); i++){
      String character = s.substring(i, i+1);

      if (opening.indexOf(character) > -1 ){ // checks if the character is an opening bracket
        stackOpen.push(character);
      }

      else if (stackOpen.isEmpty()) { return false; } // if stack is already empty before iteration is completed, there are more closing brackets than opening
      else if ( ((character.equals(")") && stackOpen.peek().equals("("))) ||
                ((character.equals("]") && stackOpen.peek().equals("["))) ||
                ((character.equals("}") && stackOpen.peek().equals("{"))) ){
        stackOpen.pop(); // remove matching opening brackets
      }
      else { return false; }
    } // close for loop
    if (!stackOpen.isEmpty()){ return false; } // if stack is not empty after iteration, there are more opening than closing brackets
    return true;
  } // close allMatched


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class

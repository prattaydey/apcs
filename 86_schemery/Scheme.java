// Team 2ndAve : Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
// APCS pd08
// HW86 -- What a Racket
// 2022-03-31
// time spent: 2.0 hrs...

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ALStack by us
 * b/c we find ArrayLists easier to iterate through
 **/

public class Scheme<T>
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    String[] split = expr.split("\\s+");
    Stack<String> arr = new ALStack<String>();
    Stack<Integer> ops = new ALStack<Integer>();

    for (int i = 0; i < split.length; i++){
      if (split[i].equals("+")){
        ops.push(1); // saves it as corresponding val for add, unloaded later
      }
      else if (split[i].equals("-")){
        ops.push(2);  // saves it as corresponding val for sub, unloaded later
      }
      else if (split[i].equals("*")){
        ops.push(3);  // saves it as corresponding val for mult, unloaded later
      }
      else if (split[i].equals("(") || isNumber(split[i]) ){ // if not an operand, push to arr stack
        arr.push( split[i] );
      }
      else { // if split[i] == ")", we have reached the end and now can perform operand
        String finalVal = unload( ops.pop(), arr ); // performs operand on each value in arr
        arr.pop(); //gets rid of the opening parenthesis
        arr.push( finalVal );
      }
    }
    return arr.pop(); // returns final value
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int result = 0;
    if (op == 1){ // addition
      while ( !numbers.peekTop().equals("(") ){
        result += Integer.parseInt( numbers.pop() );
      }
    }
    else if (op == 2){ // subtraction, val goes in reverse order down stack,
      int val = 0;
      while ( !numbers.peekTop().equals("(") ){
        val += Integer.parseInt( numbers.pop() );
        result -= val; // subtracts each time from result
    }
    result = result + val + val; // adds the first number back twice, 1 so that it isnt being subtracted, and 2 so that it is the value that is being subtracted from
  }
  else{ // op == 3, multiplication
    result = 1;
    while ( !numbers.peekTop().equals("(") ){
      result *= Integer.parseInt( numbers.pop() );
      }
    }

    return result + "";
  }//end unload()


  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }


  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme

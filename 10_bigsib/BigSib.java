//Prattay Dey
//APCS
//HW10 -- BigSibs
//2021-10-04

/*
DISCOVERIES:
- Void is used in a function that is not intended to return anything. 
- If you want the function to return something, replace void with the intended data type. In this case, we want to return a string.

UNRESOLVED MYSTERIES:
- What are some of the advantages of having a void function rather than a function that returns something?
*/

public class BigSib {
	public static String greet(String name){
		String result = ("Why, hello there, " + name + ". How do you do?");
		return result;
	}
}

//Prattay Dey
//APCS
//HW09 -- BigSibs
//2021-10-02

/*
DISCOVERIES:
- You can call a function within a java file that is defined in another java file, as long as they are in the same directory.
- If we aren't intending to exexute anything in a java file, a main() method is not required. 

UNRESOLVED MYSTERIES:
- Can you call a function that is defined in another file in a different directory?
- Why is String capitalized while the other data types are in lowercase?
*/

public class BigSib {
	public static String greet(String name){
		String result = "Why, hello there, " + name + ". How do you do?");
		return result
	}
}

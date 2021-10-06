//Prattay Dey
//APCS
//HW10 -- BigSibs
//2021-10-04

/*
DISCOVERIES:
- Instance variables are defined outside of a method.
- Need to state their protection (public/private) and their return type.

UNRESOLVED MYSTERIES:
- What is the difference between an instance variable and the type of variables we have been defining up to now?
- What are some of the advantages of using instance variables?
*/

public class BigSib {
	public static String helloMsg; // instance variable helloMsg
	public static void setHelloMsg (String newMsg) { // method to set helloMsg value
		helloMsg = newMsg;
	} 
	
	public static String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
}

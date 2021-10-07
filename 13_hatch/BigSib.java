//Prattay Dey and Sophia Eiden
//APCS
//HW12 -- BigSib Instance Variables
//2021-10-05

/*
DISCOVERIES:
- 
- 

UNRESOLVED MYSTERIES:
- 
- 
*/

public class BigSib {
	private static String helloMsg; // instance variable helloMsg
	
	public BigSib(String newMsg){
		helloMsg = newMsg
	} 
	
	public void setHelloMsg(String newMsg){
		BigSib helloMsg = new BigSib(newMsg);
	}
		
	
	public static String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
}

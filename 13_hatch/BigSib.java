//Prattay Dey and Sophia Eiden
//APCS
//HW12 -- BigSib Instance Variables
//2021-10-06

/*
DISCOVERIES:
- 
- 

UNRESOLVED MYSTERIES:
- 
- 
*/

public class BigSib {
	private static String helloMsg; //instance var helloMsg
	
	public BigSib(String newMsg){ //creates constructor
		helloMsg = newMsg
	} 
		
	public void setHelloMsg(String newMsg){ 
		BigSib helloMsg
		helloMsg = new BigSib(newMsg); //invokes constructor using "new", initializes instance var helloMsg
	}
	
	public static String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}

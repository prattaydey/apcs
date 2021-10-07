//Team Elder Gods: Prattay Dey and Sophia Eiden
//APCS
//HW12 -- BigSib Instance Variables
//2021-10-06

/*
DISCOVERIES:
- Constructors can have variable defs inside them
- You can call on the constructor to create an object in the class, using keyword "new"
- Constructors can have multiple parameters

Q/C/C:
- What are the benefits of using a constructor compared to a method? 
*/

public class BigSib {
	String helloMsg; 
	
	public BigSib(String newMsg){ // creates constructor
		helloMsg = newMsg;
	} 
	
	/*
	public void setHelloMsg(String newMsg){ 
		BigSib helloMsg
		helloMsg = new BigSib(newMsg); //invokes constructor using "new", initializes instance var helloMsg
	}
	*/
	
	public String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}

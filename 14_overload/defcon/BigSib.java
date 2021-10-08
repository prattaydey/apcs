//Prattay Dey
//APCS
//HW14 -- Customize Your Creation
//2021-10-07

/*
DISCOVERIES:
- 

Q/C/C:
- 
*/

public class BigSib {
	String helloMsg; 
	
	public BigSib(String newMsg){ // creates def constructor
		helloMsg = newMsg;
	} 
	
	public String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}

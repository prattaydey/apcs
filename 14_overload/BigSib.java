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

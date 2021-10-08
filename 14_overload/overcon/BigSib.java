//Prattay Dey
//APCS
//HW14 -- Customize Your Creation
//2021-10-07

public class BigSib {
	String helloMsg; 
	
	public BigSib(String newMsg){ // creates overloaded constructor, takes String parameter newMsg
		helloMsg = newMsg;
	} 
	
	public String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}


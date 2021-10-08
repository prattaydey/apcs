

public class BigSib {
	String helloMsg; 
	
	public BigSib(String newMsg){ // creates constructor
		helloMsg = newMsg;
	} 
	
	public String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}


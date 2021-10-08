//Team HPN- Hugo Jenkins, Boary, Nada Hameed, Ray, Prattay Dey, Winnie
//APCS
//HW14-- Customize Your Creation
//2021-10-07

/*
DISCOVERIES:
- 

Q/C/C:
- 
*/

public class BigSib {
	String helloMsg; 
	
	public BigSib(){ // creates def constructor
		helloMsg = "Hello";
	} 
	
	public String greet(String subject){
		String result = (helloMsg + " " + subject);
		return result;
	}
	
}

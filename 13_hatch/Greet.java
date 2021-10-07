//Prattay Dey and Sophia Eiden
//APCS
//HW13 -- BigSibs Constructors
//2021-10-06

	
public class Greet {
	public static void main( String[] args ) {
    	String greeting;

    	BigSib richard = new BigSib("Word Up");
    	greeting = richard.greet("freshman");
	
	System.out.println(greeting);
	
	BigSib bob = new BigSib();
	bob.setHelloMsg("Salutations");
	greeting = bob.greet("Dr. Spaceman");
	
	System.out.println(greeting);
	
	BigSib dave = new BigSib();
	dave.setHelloMsg("Hey ya");
	greeting = dave.greet("Kong Fooey");
	
	System.out.println(greeting);
	
	BigSib john = new BigSib();
	john.setHelloMsg("Sup");
	greeting = john.greet("mom");
	
	System.out.println(greeting);

  } //end main()
} //end Greet




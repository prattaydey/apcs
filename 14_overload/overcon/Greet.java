//Team HPN- Hugo Jenkins, Boary, Nada Hameed, Ray, Prattay Dey, Winnie
//APCS
//HW14-- Customize Your Creation
//2021-10-07

/*
DISCOVERIES:
Single quotations can only take a single character in java.
A contructor with no params still run and can be useful in many cases.
The difference between the Greet files is that one of them takes an argument
while creating the new instance of BigSib

QCC:
Can a constructor take multiple arguments, an array of arguments?
What other parameters could we include to make the code more efficient?
*/

public class Greet{ 
	public static void main( String[] args ) {
	String greeting;
	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Hey ya");
	BigSib dotCom = new BigSib("Sup");
	BigSib tracy = new BigSib("Salutations");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	greeting = tracy.greet("Dr. Spaceman");
	System.out.println(greeting);
	greeting = grizz.greet("Kong Fooey");
	System.out.println(greeting);
	greeting = dotCom.greet("mom");
	System.out.println(greeting);
	
  } //end main()
} //end Greet

//Team Not In Service: Prattay Dey, Nada Hameed, Fang Chen 
//Featuring Duckies: Winnie, Ray, Cat
//APCS
//HW10 -- BigSibs
//2021-10-05

	
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet




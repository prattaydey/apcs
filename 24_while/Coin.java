/***
Monke: Prattay Dey + Winnie, Jeffery Tang + Mathias
APCS
HW24 -- Coin Flip with While
2021-10-25
time spent: 1.0 hr
 ***/

/*
DISCOS:
- The symbol "!" before a boolean statement would be similar to "not" in English. It executes the body as long as the conditional is NOT met. 

QCC:
- Is there a way we can write the function so that it requires less parameters?
- Could there be a similar function that takes n number of coins instead of just 2?

POST-v0 MODS:
- No changes made to Coin.java
*/

public class Coin {

  //attributes aka instance vars
  public double value;
  public String upFace;
  public String name;
  public int flipCtr;
  public int headsCtr;
  public int tailsCtr;
  public double bias;

  /***
   *  Coin() -- default constuctor
   *  precond: no input
   *  postcond: string value for name "null"
   ***/
  public Coin() {
    name = "null";
    upFace = "heads";
    bias = 0.5;
    System.out.println(toString());
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    name = s;
    upFace = "heads";
    bias = 0.5;
    value = assignValue(s);
    System.out.println(toString());
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    name = s;
    upFace = nowFace;
    bias = 0.5;
    value = assignValue(s);
    System.out.println(toString());
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if (s == "penny") {
      value = 0.01;
    } else if (s == "nickel") {
      value = 0.05;
    } else if (s == "dime") {
      value = 0.10;
    } else if (s == "quarter") {
      value = 0.25;
    } else if (s == "half dollar") {
      value = 0.50;
    } else if (s == "dollar") {
      value = 1.00;
    } else {
      System.out.println ("ERROR: unrecognized coin name");
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = s;
    bias = d;
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    flipCtr += 1;
    double headOrTails = Math.random();
    //System.out.println(headOrTails);
    if (headOrTails >= bias) {
      headsCtr += 1;
      upFace = "heads";
      return upFace;
    } else {
      tailsCtr += 1;
      upFace = "tails";
      return upFace;
    }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return this.upFace == other.upFace;
  }
  


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return (name + " -- " + upFace);
  }

}//end class

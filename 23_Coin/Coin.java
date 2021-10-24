/***
Monke: Prattay Dey + Winnie, Jeffery Tang + Mathias
APCS
HW23 -- Coin
2021-10-23
time spent: 0.8 hr
 ***/

/*
DISCOS:
- Initially thought instance var upFace would be a boolean as there are only 2 possibilities, but found it much more convenient to use it in a String.

QCC:
- For the reset() method, one of the parameters inputs allows the user to change the bias value. Why would we need to change bias if a coin always has a 50/50 chance of landing on either side?
- We noticed that the reset() method is not used in the driver file, so is it necessary? 
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
   *  postcond: default value for name "null", default face "heads", and default bias 0.5 (equal chance of landing heads or tails).
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
    System.out.println(headOrTails);
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

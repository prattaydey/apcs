public class Rational{
  private int p;
  private int q;
  private double ratio;


  public Rational(){
    p = 0;
    q = 1;
  }


  public Rational(int numerator, int denominator){
    if (denominator != 0){
      p = numerator;
      q = denominator;
    }
    else {
      System.out.println("Error: Denominator cannot be 0. Setting rational to default value 0/1");
    }
  }


  public String toString(){
    return p + "/" + q;
  }


  public double floatValue(){
    return ratio;
  }

  public void multiply(Rational other){
    this.p *= other.p;
    this.q *= other.q;
    ratio = (double)p / (double)q;
  }


  public static int gcd(int a, int b){
    if (a == b){
      return a;
    }
    else if (a < b){
      return gcd(Math.abs(a), Math.abs(b - a));
    }
    else {
      return gcd(Math.abs(a - b), Math.abs(b));
    }
  }


  public int gcd(){
    return gcd(p,q);
  }


  public void add(Rational other){
    // storing original p and q values
    tempP = this.p;
    tempQ = this.q;

    // multiplying so that denominators are equal
    this.p *= other.q;
    this.q *= other.q;
    other.p *= tempP;
    other.p *= tempQ;

    // finally adding them together
    this.p += other.p;
    ratio = (double)p / q;
  }


  public void subtract(Rational other){
    // storing original p and q values
    tempP = this.p;
    tempQ = this.q;

    // multiplying so that denominators are equal
    this.p *= other.q;
    this.q *= other.q;
    other.p *= tempP;
    other.p *= tempQ;

    // finally adding them together
    this.p -= other.p;
    ratio = (double)p / q;
  }


  public 

  public static void main(String[] args){
    Rational r = new Rational(2,3); //Stores rational number 2/3
    System.out.println(r.toString());
    Rational s = new Rational(1,2); //Stores rational number 1/2
    r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
    System.out.println(r.toString());
    System.out.println(s.toString());
  }
}

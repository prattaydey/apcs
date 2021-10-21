/*
JPH: Jacob Kirmayer, Hugo Jenkins, Prattay Dey
apcs
HW21 -- STAtisTically Speaking...
2021-10-20
DISCO:
You can put everything on one line in java -- line spacing does not matter
Math.cbrt() takes the cube root
QCC:
Is there a math method for the nthroot?
How would we take square root if we didn't have access to the Math class?
*/

public class Stats {

  public static int mean(int a, int b) {
    return (a + b)/2;
  }

  public static double mean(double a, double b) {
    return (a + b)/2;
  }

  public static int max(int a, int b) {
    if (a>b){return a;}else {return b;}
  }

  public static double max(double a, double b) {
    if (a>b){return a;}else {return b;}
  }

  public static int geoMean(int a, int b) {
    return (int) Math.sqrt(a*b);
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a*b);
  }

  public static int max(int a, int b, int c) {
    int maximum = a;
    if (b>maximum){
      maximum = b;
    }
    if (c>maximum){
      maximum = c;
    }

    return maximum;
  }

  public static double max(double a, double b, double c) {
    double maximum = a;
    if (b>maximum){
      maximum = b;
    }
    if (c>maximum){
      maximum = c;
    }

    return maximum;
  }

  public static int geoMean(int a, int b, int c) {
    double product = (a*b*c);
    double res =  Math.cbrt(product);
    return (int) res ;
  }

  public static double geoMean(double a, double b, double c) {
    return Math.cbrt(a*b*c);
  }

}//end class

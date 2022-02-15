// Team PN: Prattay Dey + Nafiz Labib
// APCS pd8
// HW64 -- Revisitation
// 2022-02-14
// time spent: 0.5hr classtime + 0.5hr evening

public class RecursionOne{
  // factorial
  public int factorial(int n){
    if (n == 1){
      return n;
    }
    else{
      return n * factorial(n-1);
    }
  }

  public int bunnyEars(int bunnies) {
    if (bunnies == 0){
      return 0;
    }
    else{
      return 2 + bunnyEars(bunnies - 1);
    }
  }


  public int bunnyEars2(int bunnies) {
    if (bunnies == 0){
      return 0;
    }
    else if (bunnies % 2 == 0){
      return 3 + bunnyEars2(bunnies-1);
    }
      return 2 + bunnyEars2(bunnies - 1);
    }


  public int triangle(int rows) {
    if (rows <= 1){
      return rows;
    }
    else{
      return rows + triangle(rows - 1);
    }
  }

  public int countHi(String str) {
    if (str.length() < 2){
      return 0;
    }
    if (str.substring(0,2).equals("hi")){
      return 1 + countHi(str.substring(1));
    }
    else{
      return countHi(str.substring(1));
    }
  }

  public String changePi(String str) {
    if (str.length() < 2){
      return str;
    }
    else if (str.substring(0,2).equals("pi")){
      return "3.14" + changePi(str.substring(2));
    }
    else {
      return str.substring(0,1) + changePi(str.substring(1));
    }
  }


  public static void main(String[] args){
    System.out.println(factorial(1));
    System.out.println(factorial(5));
    System.out.println(factorial(10));

    System.out.println(bunnyEars(0));
    System.out.println(bunnyEars(1));
    System.out.println(bunnyEars(2));

    System.out.println(bunnyEars2(1));
    System.out.println(bunnyEars2(4));
    System.out.println(bunnyEars2(6));

    System.out.println(triangle(0));
    System.out.println(triangle(2));
    System.out.println(triangle(4));

    System.out.println(countHi("xxhixx")); // → 1
    System.out.println(countHi("xhixhix")); // → 2
    System.out.println(countHi("hi")); // → 1

    System.out.println(changePi("xpix")) // → "x3.14x"
    System.out.println(changePi("pipi")) // → "3.143.14"
    System.out.println(changePi("pip")) // → "3.14p"
  }
}

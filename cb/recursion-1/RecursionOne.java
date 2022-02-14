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

  }
}

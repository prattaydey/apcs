/*
Team JP: Jacob Kirmayer and Prattay Dey
APCS
HW25 -- Do I repeat myself?
2021-10-26
time spent: 0.2 hours
*/

/*
DISCOS:
- "++" operand is same as "+= 1", useful in incrementing counter variables in loops.

QCC:
- 
*/

public class Repeater{
  public static String fenceW(int fences){
    int built = 1; // built serves as counter 
    String result = "|";
    while (built<fences){
      result += "--|";
      built++;
    }
    return result;
  }
  public static String fenceR(int fences){
    if (fences==1){
      return "|";
    }
    else {
      return fenceR(fences-1) + "--|";
    }
  }
  
  public static void main(String[] args){
    System.out.println("4 fences using while loop: ");
    System.out.println(fenceW(4));
    System.out.println("4 fences using recursion: ");
    System.out.println(fenceR(4));
    System.out.println("Large num of fences using while loop: ");
    System.out.println(fenceW(250));
    System.out.println("Large num of fences using recursion: ");
    System.out.println(fenceW(250));
    
  }
}

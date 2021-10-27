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
- When testing out a 3 digit number as an input for fences, we saw no noteable difference in computation time. 
QCC:
- How large would fences have to be in order to find a noticeable difference in computation time between the while loop method and the recursion method? 
- As we remember from Python earlier that a loop is generally faster in processing an output than recursion, what are the benefits of using recursion over a while loop?
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

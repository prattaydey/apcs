// Prattay Dey
// APCS
// HW08 -- Refactor Freshie Zero
// 2021-09-30

/*

DISCOVERIES:
- Cleared up confusion on purpose of main() in this assignment -- holds the test cases of the function we created below it, void greet(String). 
- main() method also necessary for java file to execute or run any commands, as it serves as an "entry point"

UNRESOLVED MYSTERIES:
- Instead of executing the function 3 times with each individual name, is there a way we can print greet(String) one time while randomly choosing one of the 3 inputs given as the name? 

*/

public class Greet {
        
	public static void main(String[] args){
		greet("Bob");
		greet("Bobby");
		greet("Bobba");
		}

	public static void greet(String name){
		System.out.println("Why, hello there, " + name + ". How do you do?");
}



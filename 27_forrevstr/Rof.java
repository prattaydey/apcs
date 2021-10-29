/*
Team WPF: William Vongphanith, Prattay Dey, Fangmin Chen
APCS
HW27 -- FOR the Love of Strings
2021-10-28
time spent: 0.5 hour
*/

/*
DISCOS:
- String.substring() has 2 parameters, (int beginIndex, int endIndex)
- However, the endIndex is not required for the method to run, automatically set to String.length() if no input is given.

QCC:
- In Java, can all for loops be rewritten into while loops (and vice versa)?
*/

public class Rof {
	public static String fenceF (int posts) {
		if (posts < 1) {
			return "";
		}
		String res = "|";
		for (int x = 1; x < posts; x++) {
			res += "--|";
		}
		return res;
	}


	public static String reverseF (String s) {
		String res = "";
		for (int x = s.length(); x > 0; x--) {
			res += s.substring(x - 1, x);
		}
		return res;
	}


	public static String reverseR (String s) {
		if (s.length() == 1){
      return s;
    }
    else{
      // takes the last letter of s, then calls the function again with a new index excluding that last letter.
      return s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1));
    }


	}

	public static void main (String[] args) {
		System.out.println(fenceF(0));
		System.out.println(fenceF(1));
		System.out.println(fenceF(3));
		System.out.println(fenceF(5));
		
    		System.out.println("Employing for loop:");
		System.out.println(reverseF("stressed"));
		System.out.println(reverseF("desserts")); // made consistent
		System.out.println(reverseF("a man a plan a canal panama"));

    		System.out.println("Employing recursion:");
    		System.out.println(reverseR("stressed"));
    		System.out.println(reverseR("desserts"));
    		System.out.println(reverseF("a man a plan a canal panama"));
	}
}

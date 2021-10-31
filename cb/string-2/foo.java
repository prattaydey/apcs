// doubleChar
// Given a string, return a string where for every char in the original, there are two chars.
public String doubleChar(String str) {
  String new_str = "";
  for (int i=0; i < str.length(); i++) {
    new_str += str.substring(i,i+1);
    new_str += str.substring(i,i+1);
  }
  return new_str;
}


// countHi
// Return the number of times that the string "hi" appears anywhere in the given string.
public int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < (str.length()-1); i++) {
    if (str.substring(i, i + 2).equals("hi")){
      counter++;
    }
  }
  return counter;
}


// catDog
// Return true if the string "cat" and "dog" appear the same number of times in the given string.
public boolean catDog(String str) {
  int dogCtr = 0;
  int catCtr = 0;
  for (int i=0; i < str.length() - 2; i++){
    if (str.substring(i, i + 3).equals("dog")){
      dogCtr++;
    }
    if (str.substring(i, i + 3).equals("cat")){
      catCtr++;
    }
  }
  if (dogCtr == catCtr){
    return true;
  }
  else {
    return false;
  }
}


// countCode
// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
public int countCode(String str) {
  int counter = 0;
  for (int i=0; i < str.length()-3; i++){
    if (str.substring(i, i + 2).equals("co") && (str.substring(i+3, i+4).equals("e"))){
      counter++;
    }
  }
  return counter;
}

// endOther
// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
public boolean endOther(String a, String b) {
  String a2 = a.toLowerCase();
  String b2 = b.toLowerCase();
  if (a2.length() >= b.length() && a2.substring(a.length() - b.length(), a.length()).equals(b2)){
      return true;
  }
  else if (b2.length() > a.length() && b2.substring(b.length() - a.length(), b.length()).equals(a2)){
      return true;
  }
  else { 
    return false;
  }
}


// xyzThere
// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
public boolean xyzThere(String str) {
  boolean match = false;
  if (str.length() >= 3 && str.substring(0,3).equals("xyz")){
    match = true;
  }
  for (int i = 1; i < str.length() - 2; i++){
    if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")){
      match = true;
    }
  }
  return match;
}


public static void main(String[] args) {
  System.out.println(doubleChar("The")); // "TThhee"
  System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
  System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
  
  System.out.println(countHi("abc hi ho")); // 1
  System.out.println(countHi("ABChi hi")); // 2
  System.out.println(countHi("hihi")); // 2
                     
  System.out.println(catDog("catdog")); // true
  System.out.println(catDog("catcat")); // false
  System.out.println(catDog("1cat1cadodog")); //true
                     
  System.out.println(countCode("aaacodebbb")); // 1
  System.out.println(countCode("codexxcode")); // 2
  System.out.println(countCode("cozexxcope")); // 2
  
  System.out.println(endOther("Hiabc", "abc")); // true
  System.out.println(endOther("AbC", "HiaBc")); // true
  System.out.println(endOther("abc", "abXabc")); // true
  
  System.out.println(xyzThere("abcxyz")); // true
  System.out.println(xyzThere("abc.xyz")); // false
  System.out.println(xyzThere("xyz.abc")); // true                   
  
  }

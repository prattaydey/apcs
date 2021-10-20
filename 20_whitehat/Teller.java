/*
JPH: Jacob Kirmayer, Prattay Dey, Hugo Jenkins
APCS
HW20 -- External Audit
2021-10-19
*/

/*
DISCO:
From finding errors in this groups code, we uncovered problems within our
own code that we now need to fix.
(dataType) states the type of the following value.
QCC:
Is there an "in" function that can be used to state that a value
must be in a range?
*/

public class Teller{
  public static void main(String[] args){
    BankAccount apple = new BankAccount();
    apple.setAcctNum(100000000); //should be able to have this acct Number
    apple.setPin((short) 1000); //should be able to have this pin
    apple.deposit((double) -1000000000); //shouldn't be able to rob the bank
    System.out.println(apple.toString());
  }
}

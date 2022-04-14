public class MRKPirateBae
{
  public static void main(String[] args){
    QQKachoo<Integer> kenny = new QQKachoo<Integer>();
    kenny.addFirst(2);
    kenny.addFirst(4);
    kenny.addLast(4);
    kenny.addLast(3);
    // kenny = [4, 2, 4, 3]

    System.out.println( "peekFirst: " + kenny.peekFirst() ); // should be 2
    System.out.println( "peekLast: " + kenny.peekLast() ); // should be 3

    while ( !kenny.isEmpty() ){
      System.out.println( kenny.removeFirst() );
      System.out.println( kenny.removeLast() );
    }
    // result should be 4 3 2 4

  }
}

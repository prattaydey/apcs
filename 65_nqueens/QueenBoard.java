// Froghats: Prattay Dey, Tasnim Chowdhury, Kevin Cheng
// APCS pd8
// HW65 -- How Many Queens Can a Thinker Place, If a Thinker Can Place Queens...
// 2022-02-16
// time spent: 1.0 hrs

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */


 public class QueenBoard
 {

   private int[][] _board;

   public QueenBoard( int size )
   {
     _board = new int[size][size];
   }


   /***
    * precondition: board is filled with 0's only.
    * postcondition:
    * If a solution is found, board shows position of N queens,
    * returns true.
    * If no solution, board is filled with 0's,
    * returns false.
    */
   public boolean solve()
   {
     if (solveH(0)) {
       printSolution();
       return true;
     }
     return false;
   }


   /**
    *Helper method for solve.
    */
   private boolean solveH( int col )
   {
    // base case
    if (col >= _board.length) {
       return true; //if N queens placed, solution found
     }

    // checks if there's an avaliable space in given column
    for (int row = 0; row < _board.length; row++) {
        if (addQueen(row, col)) {

          /*recursion: if there is a space in the current column, look at the next one to
          see if its a valid solution*/
          if (solveH(col+1)) {
            return true;
          }
          else{
            removeQueen(row, col);
          }
          /* since there would be no possible positions for queens
          in next column the current position is invalid as a position for a queen
          unless its the last column and the solution is complete*/

        } /*exiting here means there is an empty column (invalid solution)
        and to place first queen in the following row in the first column*/
      }
      return false;
     }


   public void printSolution()
   {
     /** Print board, a la toString...
         Except:
         all negs and 0's replaced with underscore
         all 1's replaced with 'Q'
     */
     String ans = "";
     for( int r = 0; r < _board.length; r++ ) {
       for( int c = 0; c < _board[0].length; c++ ) {
         if (_board[r][c] == 1){
           ans += "Q" + "\t";
         }
         else{
           ans += "_" + "\t";
         }
       }
       ans += "\n";
     }
     System.out.println(ans);
   }



   //================= YE OLDE SEPARATOR =================

   /***
    * <General description>
    * precondition: row and col must be within size of 2D int array
    * postcondition: returns true if Queen is placed in that position,
    all tiles in front and front diagonals are marked as -1. Queen itself
    marked as 1. If Queen not placed, return false.
    */
   private boolean addQueen(int row, int col)
   {
     if(_board[row][col] != 0){
       return false;
     }
     _board[row][col] = 1;
     int offset = 1;
     while(col+offset < _board[row].length){
       _board[row][col+offset]--;
       if(row - offset >= 0){
         _board[row-offset][col+offset]--;
       }
       if(row + offset < _board.length){
         _board[row+offset][col+offset]--;
       }
       offset++;
     }
     return true;
   }


   /***
    * <General description>
    * precondition:
    * postcondition:
    */
   private boolean removeQueen(int row, int col){
     if ( _board[row][col] != 1 ) {
       return false;
     }
     _board[row][col] = 0;
     int offset = 1;

     while( col+offset < _board[row].length ) {
       _board[row][col+offset]++;
       if( row - offset >= 0 ) {
         _board[row-offset][col+offset]++;
       }
       if( row + offset < _board.length ) {
         _board[row+offset][col+offset]++;
       }
       offset++;
     }
     return true;
   }


   /***
    * <General description>
    * precondition:
    * postcondition:
    */
   public String  toString()
   {
     String ans = "";
     for( int r = 0; r < _board.length; r++ ) {
       for( int c = 0; c < _board[0].length; c++ ) {
         ans += _board[r][c]+"\t";
       }
       ans += "\n";
     }
     return ans;
   }


   //main method for testing...
   public static void main( String[] args )
   {
     QueenBoard b = new QueenBoard(5);
     System.out.println(b);
     /** should be...
        0	0	0	0	0
        0	0	0	0	0
        0	0	0	0	0
        0	0	0	0	0
        0	0	0	0	0
     */

     b.addQueen(3,0);
     b.addQueen(0,1);
     System.out.println(b);
     /** should be...
        0	1	-1	-2	-1
        0	0	-2	0	0
        0	-1	0	-1	0
        1	-1	-1	-1	-2
        0	-1	0	0	0
     */

     b.removeQueen(3,0);
     System.out.println(b);
     /** should be...
        0	1	-1	-1	-1
        0	0	-1	0	0
        0	0	0	-1	0
        0	0	0	0	-1
        0	0	0	0	0
     */

     for (int n = 1; n < 10; n++){ // tests boards from 1x1 to 15x15
       QueenBoard c = new QueenBoard(n);
       System.out.println(n + "x" + n + " board: \n");
       c.solve();
     }

   }

 }//end class

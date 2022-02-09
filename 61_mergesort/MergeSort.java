//Team duo Abdullah faruque, Prattay Dey
//APCS pd8
//HW61: Instructions so Simple...
//2022-02-08
//time spent: 0.5 hrs

/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  sort your array using sort. Sort uses merge
  Sort breaks up your list till its turned into tiny pieces that are size 1. Then we start merging which does the sorting part, giving us a sorted list.


  ***/

  public class MergeSort
  {
    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ){
      int[] c = new int[a.length + b.length];
      int aCtr = 0;
      int bCtr = 0;

      for(int i = 0; i <c.length; i++){
        if(aCtr >= a.length) {
          c[i]=b[bCtr];
          bCtr++;
        } else if(bCtr >= b.length) {
          c[i]=a[aCtr];
          aCtr++;   //first two if statements are to check whether or not the counter is past the size.
                    // if it is past the size, we add the rest of the other array, cus ITS ALREADY sorted.
      } else {
        if(a[aCtr] < b[bCtr]){
            c[i]=a[aCtr];
            aCtr++;
          } else {
            c[i]=b[bCtr];
            bCtr++;
          }// adding process, knowing that the counter is less than the size of the list being worked with
        }
      }
      return c;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ){
     if (arr.length > 1){
      int middle = arr.length / 2;
      int[] a = new int[middle];
      int[] b = new int[arr.length - middle];
      for (int i = 0; i < a.length; i ++){
        a[i] = arr [i];
      }
      for (int i = 0; i < b.length; i ++){
        b[i] = arr[i + middle];
      }
      return merge(sort(a), sort(b)); //keeps breaking it up till the input arr is size 1.
     } else {return arr;}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
      for( int i = 0 ; i<a.length; i++ )
        a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
      System.out.print("[");
      for( int i : a )
        System.out.print( i + ",");
      System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args )
    {

        int[] arr0 = {0};
        int[] arr1 = {1};
        int[] arr2 = {1,2};
        int[] arr3 = {3,4};
        int[] arr4 = {1,2,3,4};
        int[] arr5 = {4,3,2,1};
        int[] arr6 = {9,42,17,63,0,512,23};
        int[] arr7 = {9,42,17,63,0,9,512,23,9};
        int[] arr8 = {1,3,5,7,2,4,6,8,10};


        System.out.println("\nTesting mess-with-array method...");
        printArray( arr3 );
        mess(arr3);
        printArray( arr3 );

        System.out.println("\nMerging arr1 and arr0: ");
        printArray( merge(arr1,arr0) );

        System.out.println("\nMerging arr4 and arr6: ");
        printArray( merge(arr4,arr6) );

        System.out.println("\nSorting arr4-7...");
        printArray( sort( arr4 ) );
        printArray( sort( arr5 ) );
        printArray( sort( arr6 ) );
        printArray( sort( arr7 ) );
        printArray( sort( arr8 ) );

    }//end main()

  }//end class MergeSort

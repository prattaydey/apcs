// Team McDonalds$24MScam: Prattay Dey, Joshua Gao, Faiza Huda
// Ducks : Winnie, Batman, Truthful Tom, Huebert
//APCS pd8
//HW72 -- QuickSort
//2022-03-09w
//time spent: 1h

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place

 * 1. Summary of QuickSort algorithm:
	Partition array, then partition the stuff to the right and the stuff to the left
 * QSort(arr): calls on helper which has parameters to do partitioning
 
 * 2a. Worst pivot choice and associated run time:
 *     Worst choice is choosing extreme pivot
       Means having to interate thru the whole thing meaning O(n^2)
 * 2b. Best pivot choice and associated run time:
 *     Choosing the middle element(in the sorted array) as pivot
 *     Only O(nlogn) because you keep halving everytime
 * 3. Approach to handling duplicate values in array:
 *     Before I tried doing fastselect to get the bestcase everytime, but it gave me overflow for this
       So I just changed my code to pick a pivot close to the middle but not quite.
 **/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
	quickSortHelper (d, 0, d.length);
  }

  //you may need a helper method...

  public static void quickSortHelper ( int[] arr, int begin, int end) {
	if (begin < end) {
		int y = ((int)(end - begin) / 2);     //choosing yth element to be the mid one
		int pIndex = QuickSelect.fastselect(arr, begin, end, y); //gives us the index of the middle element in arr

		quickSortHelper( arr, begin, pIndex - 2);
		quickSortHelper( arr, pIndex+1, end - 1);
	}
  }



  //main method for testing
  public static void main( String[] args )
  {
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
    System.out.println("\narrN init'd to: " );
    printArr(arrN);
    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);
    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);


    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);
    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);
    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);
    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);
    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);

  }//end main

}//end class QuickSort

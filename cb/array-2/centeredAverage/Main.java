// https://codingbat.com/prob/p136585

public class Main {
    public static void main(String[] args) {
      int[] test1 = {1,2,3,4,100};
      int[] test2 = {1,1,5,5,10,8,7};
      int[] test3 = {-10,-4,-2,-4,-2,0};

      System.out.println(centeredAverage(test1)); // 3
      System.out.println(centeredAverage(test2)); // 5
      System.out.println(centeredAverage(test3)); // -3
    }

    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    */

    public static int centeredAverage(int[] nums) {
      int largest = 0;
      int smallest = nums[0];
      int largestIndex = 0;
      int smallestIndex = 0;
      for (int counter = 0; counter < nums.length; counter++){
        largest = Math.max(nums[counter], largest);
        if (Math.max(nums[counter], largest) == nums[counter]){
          largestIndex = counter;
        }
        smallest = Math.min(nums[counter], smallest);
        if (Math.min(nums[counter], smallest) == nums[counter]){
          smallestIndex = counter;
        }
        if (smallestIndex == largestIndex){
          smallestIndex = 0;
        }
      }
      int[] newA = new int[nums.length - 2];
      int numsCounter = 0;
      for (int counter = 0; counter < nums.length; counter++){
        if (counter != smallestIndex && counter != largestIndex){
          newA[numsCounter] = nums[counter];
          numsCounter++;
        }
      }
      int sumOfNewA = 0;
      for (int counter = 0; counter < newA.length; counter++){
        sumOfNewA += newA[counter];
      }
      return sumOfNewA / newA.length;
    }

  }

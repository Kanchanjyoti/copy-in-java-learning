import java.util.*;
public class Array{

  //  public static int binarySearch(int arr[], int key){
  //  for(int i=0; i<=arr.length -1; i++){
  //   if(key== arr[i]){
  //     return i;
  //   }
  //  }
  //  return -1;
  //  }

  //  public static int findLargest(int arr[]){
  //      int max = Integer.MIN_VALUE ;
  //      for(int i=0; i<=arr.length -1; i++){
  //       if(max < arr[i]){
  //         max= arr[i];
  //       }

  //      }
  //      return max;
  //  }

  //  public static void reverseArray(int arr[]){
  //   int first= 0;
  //   int last= arr.length-1;
  //   while(first<last){
  //     int temp = arr[first];
  //     arr[first]= arr[last];
  //     arr[last]= temp;
  //     first++;
  //     last--;
  //   }
  //  }

    // public static void arrayPairs(int arr[]){
    //   for(int i=0; i<arr.length-1; i++){
    //     for(int j=i+1; j<arr.length; j++){
    //       System.out.print("("+ arr[i] +" ,"+ arr[j] +"),  " );
    //     }
    //     System.out.println();
    //   }
    // }

    //  Print the subarrays and their count 
/*public static void arraySubarray(int arr[]){
    for(int i=0; i <arr.length ; i++){
      for(int j=0; j <arr.length ; j++){
         int sum=0;
        for(int k=i; k<=j; k++){
          System.out.print(arr[k]+" ");
          sum= sum+ arr[k];
        }
        System.out.println(sum);
        
      }
      System.out.println();
    }
}*/

//  max sum (Simple approch )
 /* public static int maxSubArray(int arr[]){
    int maxSum= Integer.MIN_VALUE;

    for(int i=0; i<=arr.length -1; i++){
      for(int j=i; j<=arr.length-1; j++){
          int sum=0;
          for(int k=i;k<=j ; k++){
            sum += arr[k];
          }
          System.out.println(sum);

          if(maxSum<sum ){
            maxSum = sum;
          }

      }
    }
    return maxSum;   */
  

//  kadanes algorithm for max sum 

/*public static int kadanes(int arr[]){

  int max_sum = Integer.MIN_VALUE;
  int currSum =0;
  for(int i=0; i<arr.length; i++){
     if((arr[i]+ currSum) <0){
     currSum =0;
     }
     else{
      currSum += arr[i];
     }
     if(max_sum< currSum){
      max_sum = currSum;
     }
  }
  return max_sum;
}*/

// Calculating trapped water 

 public static int waterTrapped(int arr[]){
        int n = arr.length;
      // left max 

      int left_max[]= new int[n];
      left_max[0]= arr[0];
      for(int i=1; i<n; i++){
        left_max[i]= Math.max(arr[i], left_max[i-1]);
      }
     int right_max[]= new int[n];
      right_max[n-1]= arr[n-1];
      for(int j=n-2; j>=0;j--){
        right_max[j]= Math.max(arr[j], right_max[j+1]);
      }
    // Water calculate
    int water_area = 0;
    for(int k=0; k<n;k++){
       water_area += Math.min(left_max[k], right_max[k])- arr[k]; 
    }
    return water_area;
    
    }

// max Profit problem 
 public static int maxProfit(int arr[]){
        int n= arr.length;
     int max_sell[]=new int[n];

        max_sell[n-1]=0;
          for(int j= n-2 ; j>=0; j--){
              max_sell[j]=Math.max(arr[j+1], max_sell[j+1]);
          }
        

    //  max profit Calculating
    int max_profit=0;
     for(int i=0;i<n;i++){
          if((max_sell[i]-arr[i])>max_profit){
             max_profit= max_sell[i]-arr[i];
          }

     }
     return max_profit;
 }




  public static void main(String args[]){
    // binary search in an array
    int arr[]={12,3,2,7,10,4};
    // System.out.println("The key index will be "+ binarySearch(arr, 23));

    //  find the largest in an array 
    // System.out.print("The largest number is : "+ findLargest(arr ));

    // to reverse the array
    // reverseArray(arr);

    // for(int i=0;i<= arr.length-1;i++){
    //   System.out.print(arr[i] + " ");
    // }


    // to print the array pairs in the given array
    // arrayPairs(arr);

    // print subarrays and their count 
    // arraySubarray(arr);

    //  Find the sum of subarrays and print the max sum of subarrays
    // System.out.print("The max sum of subarray will be : "+ maxSubArray(arr));

  //  finding the sum of subarrays through kadanes algorithm 
    // System.out.print("The max sum will be : "+ kadanes(arr));

  //  Calculating trapped water in bars 
    // System.out.print( "The total trapped water in bars will be : " + waterTrapped(arr)+ " units square");

    // Max Profit after buying stocks

    System.out.print("The max profit will be : "+ maxProfit(arr));
  }
}
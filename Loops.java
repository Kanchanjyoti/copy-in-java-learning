import java.util.*;

public class Loops {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
// Problem 1. HOw many times hello will be printed    ans: 2

/*  for(int i=0; i<5;i++){
    System.out.println("hello wolrld ");
    i+=2;
   }                                         */

   // problem 2. write the program to read the set of integer and print the sum of odd and even integer

/*   int arr[]={ 1,34,-41,22,-1,2};

   int negativeSum=0;
   int positiveSum=0;
   for(int i=0; i<arr.length;i++){
    if(arr[i]>0){
        positiveSum= positiveSum + arr[i];
    }
    else{
        negativeSum = negativeSum+ arr[i];
    }
   }
    System.out.print("The negative sum is " + negativeSum + " The positive sum is " + positiveSum);  */

    // Problem 3. Calculate the factorial of the givern number

/*    int number = sc.nextInt();
    int fac=1;
    for(int i=number; i>0; i-- ){
      fac = fac * i;
    }
    System.out.print("The factorial of given number will be "+ fac);     */

    // Problem 4. multiplication table of given number

/*    int n = sc.nextInt();
    for(int i=1; i<=10;i++){
      System.out.println(n + " X " + i + " = " + i*n );
    }                                                         */
    
  }
} 

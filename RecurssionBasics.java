public class RecurssionBasics {

  //  Printing numbers from n to 1
  public static void decNumber(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    decNumber(n - 1);
  }

  // Print the number from 1 to n
  public static void printNum(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printNum(n - 1);
    System.out.print(n + " ");
  }

  //  Print the factorial of given number
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    int fact = factorial(n - 1);
    return n * fact;
  }

  //  Calculate sum of n natural numbers
  public static int sumOfN(int n) {
    if (n == 1) {
      return 1;
    }
    int sum = sumOfN(n - 1);
    return n + sum;
  }

  // Print the nth number in fabonacci series
  public static int fabonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int fabN_1 = fabonacci(n - 1);
    int fabN_2 = fabonacci(n - 2);
    return (fabN_1 + fabN_2);
  }

  //  Check if the given array is sorted or not
  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {
      return false;
    }
    return isSorted(arr, i + 1);
  }

  //     return the index where the key is first occured in an array
  public static int firstOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOccurance(arr, key, i + 1);
  }

  // Print last occurance of an element in an array
  public static int lastOccurance(int arr[], int key, int i) {
    if (i == -1) {
      return i;
    }
    if (arr[i] == key) {
      return i;
    }
    return lastOccurance(arr, key, i - 1);
  }

  //  Print x ^ n
  public static int powerOfN(int x, int n) {
    if (n == 1) {
      return x;
    }
    return x * powerOfN(x, n - 1);
  }

  //  Optimised code for power of x
  public static int opPowerOfN(int x, int n) {
    if (n == 1) {
      return x;
    }
    int power = opPowerOfN(x, n / 2);
    if (n % 2 == 0) {
      return (power * power);
    }
    return (x * power * power);
  }
    //  Tiling problem code
    public static int tiling(int n){
      
      if(n==1 || n==0){
        return 1;
      }
      int horizontal= tiling(n-2);
      int vertical = tiling(n-1);
      return horizontal+vertical;

    }

  //   Friend pairing problem 
  public static int friendPair(int n){
    if(n==1){
      return 1;
    }
    if(n==2){
      return 2;
    }
    // if single
    int single= friendPair(n-1);
    int pair= friendPair(n-2);
    return (single + (n-1) * pair);
  }
  // Print the binary number with no concecutive set number 
  public static void noConsecutiveSet(int n, int lastPlace, StringBuilder str){
    if(n==0){
      System.out.println(str);
      return;
    }
    if(lastPlace== 0){
       noConsecutiveSet(n-1, 0, str.append("0"));
       noConsecutiveSet(n-1, 1, str.append("1"));
    }
    else{
       noConsecutiveSet(n-1, 0, str.append("0"));
    }
  }
  public static void main(String args[]) {
    int number = 20;
    //    Printing in decreasing order
    decNumber(number);
    System.out.println();
    //     Printing in increasing order
    printNum(number);
    //     calculating factorial
    System.out.println(factorial(5));
    // calculating sum of n natural numbers
    System.out.println(" The sum will be " + sumOfN(10));
    // Printing nth number in fabonacci
    System.out.println("The number will be " + fabonacci(5));
    // Check whether the array is sorted or not
    int arr[] = { 1, 5, 6, 9, 12 };
    System.out.println(isSorted(arr, 0));
    //  return the index where the key is first occured in an array
    int arr1[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
    System.out.println(firstOccurance(arr1, 2, 0));
    //     return the index where the key is last occured in an array
    System.out.println(lastOccurance(arr1, 3, 8));
    //     Printing the power of x
    System.out.println(powerOfN(5, 3));
    //  Optimesed code for power of x
    System.out.println(opPowerOfN(3,5));
    // Tiling problem 
    System.out.println(tiling(4));
    //  Friend pairing 
    System.out.println(friendPair(3));
    //  Binary string problem 
    StringBuilder str= new StringBuilder("");
    noConsecutiveSet(3, 0, str);

  }
}

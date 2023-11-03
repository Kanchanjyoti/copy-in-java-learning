import java.util.*;
public class BitManipulation{
    // checking whether the number is even or odd
    public static void checkEven(int n){
        if((n & 1) == 1){
        System.out.println("Even number ");
       }
        else{
        System.out.println("Odd number");
       }
    }
    // Get the number of the ith place 
    public static int getIthIndex(int number , int index){
          number = number >> (index);
          if((number & 1)== 1){
            return 1;
          }
          else{
            return 0;
          }
    }
    // To set the ith bit of given number 

    public static int setIthBit(int number , int index){
        int bitMask= 1<< index;
        number= number | bitMask;
        return number;

    }

    // Clear the ith bit of given number
    public static int clearIthBit(int number , int index){
        int bitMask= ~(1<<index);
        number = number & bitMask;
        return number;
    }

    // Updating the ith bit 
    public static int updateIthBit(int number, int index, int changeInto){
        number= clearIthBit(number, index);
         number =setIthBit(number, changeInto);
         return number;
    }

    //  Clear last ith bits

    public static int clearLastBits(int number, int index){
        int bitMask= (~0)<< (index+1) ;
        number = number & bitMask ;
        return number;
    }

    // Clear the range of bits
    public static int clearRange(int number, int j, int i){
        int a= (~0)<< (j+1);
        int b= (int)Math.pow(2,i) -1;
        number= number & (a|b);
        return number;
    }

    // Checking whether the given number is power of 2 or not 
    public static boolean isPowerOfTwo(int number){
        return ((number & (number-1)) == 0); 
    }

    public static void main(String args[]){
        // binary And(&) 
        System.out.println(5 & 2);
        // Binary Or(|)
        System.out.println(5|2);
        // Binary XOR(^)
        System.out.println(5^2);
        // Binary Not(~)
        System.out.println(~5);
        // Binary left shift(<<)
        System.out.println(5<<1);
        // Binary right shift(>>)
        System.out.println(5>>1);

        //  Check whether number is even or odd
         checkEven(23);
         checkEven(22);
         checkEven(13);

         // Get ith bit 
         System.out.println("The ith bit will be "+ getIthIndex(15,3));
        
        // Set ith bit 
        System.out.println(setIthBit(12, 1));

        //  Clear ith bit 
        System.out.println(clearIthBit(14, 3));

        //  Update ith bit 
        System.out.println(updateIthBit(15, 2, 0));

        // Clear last ith bits
        System.out.println(clearLastBits(13,2));

        //  Clear the range of bits 
        System.out.println(clearRange(22, 2,0));

        // Check if a number is a power of 2 or not 
        System.out.println(isPowerOfTwo(32));

    }
}
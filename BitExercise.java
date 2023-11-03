public class BitExercise{
    // Swap two numbers without using any third variable 

    public static void swapNumbers(int n, int m ){
        System.out.println("Before Swapping");
        System.out.println("Value of x : " + n );
        System.out.println("Value of y : " + m );

     // Swap using Xor operator
        n = n^m;
        m = n^m;
        n = n^m; 

        System.out.println("After Swapping");
        System.out.println("Value of x : " + n );
        System.out.println("Value of y : " + m );
    }
    // Add 1 to a number using bitwise operators only 

    public static int addOne(int number){
        int count=0;
        while((number & 1) != 0){
          number= number>>1;
          count++;
        }
        number = (number | 1);
        return number<<count;

       
    }

    public static void main(String args[]){
        System.out.println(addOne(0));
        swapNumbers(12, 34);

    }
}
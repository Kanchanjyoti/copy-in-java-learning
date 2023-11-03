public class RecurssionExer{ 
    // Find the all occurance of given key in an array 
    public static void findKey(int arr[], int key, int i){
        if(i== arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+ " ");
        }
         findKey(arr, key, i+1);
    }

    public static void convertToString(int number, String arr[]){
         if(number==0){
            return ;
         }
         int lastNumber= number%10;
         convertToString(number/10, arr);
         System.out.print(arr[lastNumber] + " ");
        }

        //  To find the length of string 
        
    public static void main(String args[]){
    int arr[]= {3,2,4,5,6,2,7,2,2};
    findKey(arr, 2, 0 );
    String number[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
      convertToString(2023, number);
    }
}
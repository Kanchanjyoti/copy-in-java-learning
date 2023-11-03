import java.util.*;
public class Sort{  
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
}
    // Bubble Sort   

    // public static void bubbleSort(int arr[]){
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length -i-1 ; j++){
    //             if(arr[j+1]<arr[j]){
    //             int temp = arr[j];
    //             arr[j]= arr[j+1];
    //             arr[j+1]= temp;

    //             }
    //         }
    //     }
    // }


//   Selection sort

    // public static void selectionSort(int arr[]){
    //     for(int i=0;i< arr.length-1;i++){
    //         int min= i;

    //         for(int j=i; j<arr.length; j++){
    //                 if(arr[min]> arr[j]){
    //                     min = j;
    //                 }

    //         }
    //         int temp = arr[i];
    //         arr[i]= arr[min];
    //         arr[min]= temp;
    //     }
    // }
//    Insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1; i < arr.length ; i++){
            int key = arr[i];
            int j= i - 1;
            while(j >= 0 && arr[j] > key ){
                arr[j+ 1]= arr[j];
                 j = j -1;
            }
            arr[j+1]= key;
        }
    }

    public static void countingSort(int arr[], int range){
        // array for counting 
         int count[]= new int[range+1];
         for(int i=0; i<arr.length ; i++){
            count[arr[i]]++;
         }

         int j=0;
         for(int i=0; i<= range ; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
         }
    }
    public static void main(String args[]){
       int arr[]={3,1,2,4,2,1,4,7,2,8};
    //    bubbleSort(arr);
    //    selectionSort(arr);
    //   insertionSort(arr);
         countingSort(arr, 8);
          printArray(arr);
    }
}
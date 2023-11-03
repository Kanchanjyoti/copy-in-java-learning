public class SortingExercise{
        // sorting an array using following methods in decresing order 
        //  bubble sort

        // printing array function 
        public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] +" ");
            }
        }
        public static void bubbleSort(int arr[]){
            for(int i =0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j]<arr[j+1]){
                        int temp= arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;
                    }
                }            
            }
        }
        public static void selectionSort(int arr[]){
            for(int i=0; i<arr.length-1; i++){
                int max= i;
                for(int j=i; j<arr.length;j++){
                       if(arr[j]>arr[max]){
                        max= j;
                       }
                }
                int temp= arr[i];
                arr[i]= arr[max];
                arr[max]= temp;
            }
        }

        public static void insertionSort(int arr[]){
            for(int i=1;i<arr.length; i++){
                int key= arr[i];
                int j= i-1;
                while(j>=0 && key>arr[j]){
                    arr[j+1]= arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        }

        public static void countingSort(int arr[]){
            int max= Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                if(max<arr[i]){
                    max = arr[i];
                }
            }

            int counting[]= new int[max+1];
            for(int i=0; i<arr.length; i++){
                counting[arr[i]]++;
            }
          int j=0;
          for(int i=counting.length-1; i>=0; i--){
            while(counting[i] > 0){
                arr[j] =i;
                j++;
                counting[i]--;
            }
        }
        }

        public static void main(String args[]){
         int arr[]= {3,6,2,1,8,7,4,5,3,1};
          bubbleSort(arr);
         selectionSort(arr);
         insertionSort(arr);
         countingSort(arr);
         printArray(arr);
        }
}
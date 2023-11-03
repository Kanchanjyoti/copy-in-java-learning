public class TwoDExercise{
    // print the repetition count of given element in two d array 
    public static int countElement(int arr[][], int element){
         int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]== element){
                    count++;
                }
            }
        }
        return count;
    }
    // print only second row of the array
    public static void printSecond(int arr[][]){
        for(int i=0; i<arr[0].length; i++){
            System.out.print(arr[1][i]+ " ");
        }
    }
    // converting array to its transpose 
    public static void printArray(int arr[][]){
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){ 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
    }
    public static void convertToTranspose(int arr[][]){
        int transpose[][]= new int[arr[0].length][arr.length];
       for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                transpose[i][j]= arr[j][i];
                }
            }
            printArray(transpose);
     }
    
    public static void main(String args[]){
        int arr[][]= {{1,2,3,4}, {5,6,1,8}};
        // System.out.print("The element repeats in an array is "+ countElement(arr, 1)+" times");
        // printSecond(arr);
        // convertToTranspose(arr);
    }
}
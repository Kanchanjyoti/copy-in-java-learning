import java.util.*;
public class TwoDArray{
    public static void findElement(int arr[][], int element){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                if(arr[i][j]== element ){
                    System.out.print(i +" "+ j);
                    return ;
                }
            }
        }
        System.out.print("-1");
    }
public static int maxElement(int arr[][]){
       int max =Integer.MIN_VALUE;

     for(int i=0;i<arr.length;i++){
         for(int j=0; j<arr[0].length; j++){
               if(max<arr[i][j]){
                max=arr[i][j];
               }
         }

}
         return max;
}
public static int minElement(int arr[][]){
       int min =Integer.MAX_VALUE;

     for(int i=0;i<arr.length;i++){
         for(int j=0; j<arr[0].length; j++){
               if(min>arr[i][j]){
                min=arr[i][j];
               }
         }

}
         return min;
}

public static void spiralMatrix(int arr[][]){
    int n= arr.length;
    int m= arr[0].length;
    int startRow= 0;
    int startCol= 0;
    int endRow= n-1;
    int endCol= m-1;
   // top
   while(startRow<=endRow && startCol<=endCol ){
    for(int i=0; i<=endCol; i++){
        System.out.print(arr[startRow][i]+ " ");
    }
    // right 
    for(int j=startRow+1; j<=endCol; j++){
        System.out.print(arr[j][endCol]+" ");
     }

     // bottom 
     for(int k= endCol-1; k>=startCol; k--){
        if(startRow==endRow){
            return;
        }
        System.out.print(arr[endRow][k]+" ");
     } 
    //  left
     for(int j=endRow-1; j>=startRow+1; j--){
        if(startCol==endCol){
            return;
        }
        System.out.print(arr[j][startCol]+" ");
     }
     startRow++;
     startCol++;
     endCol--;
     endRow--;
}
}

// Diagonal sum 
public static int diagonalSum(int arr[][]){
    int sum =0;
    for(int i=0; i< arr.length; i++){
        //  for primary diagonal 
       sum += arr[i][i];
       // for secondary diagonal 
       sum += arr[i][arr.length-1-i];

    }
    return sum;
}

// Searching in sorted array 
  public static void searchOnSort(int arr[][], int element){
    int firstRow=0;
    int firstCol=0;
    int endCol=arr[0].length-1;
    int endRow= arr.length -1; 
    
    while(firstRow<=endRow && firstCol<=endCol ){
        if(arr[firstRow][endCol] == element ){
            System.out.print("The index is "+ firstRow+ " "+ endCol);
            return;
        }
        else if(arr[firstRow][endCol] > element){
            endCol--;
        }
        else{
            firstRow++;
        }
    }
    System.out.print("-1");

  }

    public static void main(String args[]){
        // int arr[][]= new int[3][3];

        // input 

        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3 ;j++){
        //         arr[i][j]= sc.nextInt();
        //     }
        // }  
        // output

    //     for(int i=0;i<3;i++){
    //         for(int j=0; j<3; j++){
    //             System.out.print(arr[i][j]+ " ");
    //         }
    //         System.out.println();
    //     } 
    //  }

    int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    findElement(arr, 7);
    // System.out.print("The maximum element in array : " + maxElement(arr));
    // System.out.print("The minimum element in array : " + minElement(arr));
    //  spiralMatrix(arr);
    // System.out.print("The total sum of the diagonal elements will be :"+ diagonalSum(arr));
    // searchOnSort(arr, 15);

}
}
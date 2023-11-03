public class ArrayAssesment{
    // public static boolean repetiotionCheck(int arr[]){
    //     for(int i=0;i<arr.length; i++){
    //         int curr = arr[i];
    //         for(int j=i+1; j<arr.length; j++){
    //             if(curr == arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public static int rotationByPoint(int arr[], int index, int element){
    //     int n= arr.length;
    //     int mid =0;
    //     int si=0;
    //     int ei= n-1;
    //     // Binary search
    //    while(si<=ei){

    //         mid=(ei -si)/2;
    //         if(arr[mid]==element){
    //             return (mid+ index +1)% n ;
    //         }
    //         if(arr[mid]< element ){
    //             si = mid+1;
    //         }
    //         if(arr[mid]>element){
    //             ei=mid-1;
    //         }
    //    }
    //     return -1;
    // }

    // public static int profitArray(int arr[]){
    //     int n= arr.length;
    //     int auxi[]= new int[n];

    //     auxi[n-1]=0;
    //       for(int j= n-2 ; j>=0; j--){
    //           auxi[j]=Math.max(arr[j+1], auxi[j+1]);
    //       }
        
        
    //     int max_profit= 0;
    //     int profit=0;

    //     for(int k=0; k <n; k++){
    //        profit = auxi[k]- arr[k];
    //        max_profit = Math.max(profit, max_profit);
    //     }
    //     return max_profit;
    // }

    // water trapped problem 

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
    // Finding a different number whose sum is zero in an array 
       public static void findingTriplet(int arr[]){
        for(int i=0;i<arr.length-2; i++){
          for(int j= i+1; j<arr.length-1; j++){
            for(int k=j+1; k<arr.length; k++){
              if(arr[i]+arr[j]+arr[k]== 0){
                System.out.println(" ("+ arr[i]+" "+arr[j]+" "+arr[k]+" )");
              }
            }
          }
        }
       }
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4}; 
        // System.out.print(repetiotionCheck(arr));
        // System.out.print(rotationByPoint(arr,3 , 7));
        // System.out.print(profitArray(arr));
        // System.out.print("The total water trapped is "+ waterTrapped(arr));
         findingTriplet(arr);
    }
}
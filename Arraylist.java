import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Solution 5.
    public static int storeWater(ArrayList<Integer> height ){
     int maxWater = 0;
     for(int i=0; i<height.size(); i++){
        for(int j=i+1; j<height.size(); j++){
            int ht= Math.min(height.get(i), height.get(j));
            int width= j-i;
            int currWater= ht* width;
            maxWater= Math.max(maxWater, currWater);
        }
     }
     return maxWater;

}   
// Solution5.  Optimised Code of store Water
   public static int storeWaterOp(ArrayList<Integer> height){
    int maxWater=0;
    int lp=0;
    int rp=height.size()-1;
    while(lp<rp){
        int ht= Math.min(height.get(lp),height.get(rp));
        int width= rp-lp;
        int currentWater= ht*width;
        maxWater= Math.max(maxWater, currentWater);
        if(height.get(lp)<height.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
    }
        return maxWater;
   }

//    Solution 6. Brute force approch
      public static boolean pairSum(ArrayList<Integer> pairList, int target){
          for(int i=0; i<pairList.size(); i++){
            for(int j=i+1; j<pairList.size(); j++){
                if((pairList.get(i)+pairList.get(j))== target){
                    return true;
                }
            }
          }
          return false;
      }

//   second solution : optimized version 
    public static boolean pairSumOp(ArrayList<Integer> pairList, int target){
        int lp= 0;
        int rp=pairList.size()-1;
        while(lp<rp){
            if(pairList.get(lp)+pairList.get(rp)== target){
                return true;
            }
            else if(pairList.get(lp)+pairList.get(rp)< target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
 public static void main(String[] args){
           // Syntex: ArrayList<DataType_Name> variable_Name = new ArrayList<>();
           ArrayList<Integer> list = new ArrayList<>();
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           System.out.println(list);
           System.out.println(list.get(2));
           list.remove(3);
           System.out.println(list);
           list.set(2,5);
           System.out.println(list);
           System.out.println(list.contains(3));

        //    Problem 1. Print reverse of an arraylist:
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();

        //  Problem 2. Find maximum in the arraylist
        int max= Integer.MIN_VALUE;
        for(int j=0; j<list.size();j++){
            max= Math.max(list.get(j), max);
        }
        System.out.println("Max No: " + max);

        // Problem 3. Swap Two Numbers
       swap(list, 1,2);
       System.out.println(list);

        //  Problem 4. Sorting an arraylist
       Collections.sort(list);
       System.out.println(list);
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);

    //     # Multidimentional ArrayList : 
    ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
    ArrayList<Integer> list1= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    ArrayList<Integer> list3= new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add(4);
    list2.add(5);
    list2.add(6);
    list3.add(7);
    list3.add(8);
    list3.add(9);

    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
System.out.println(mainList);

// Problem 5. Container with most water
//  Brute force : Calculate all pairs and print the max
   ArrayList<Integer> height= new ArrayList<>();
   height.add(1);  
   height.add(8);  
   height.add(6);  
   height.add(2);  
   height.add(5);  
   height.add(4);  
   height.add(8);  
   height.add(3);  
   height.add(7);  

System.out.println("The maximum water stored between two heights is "+ storeWater(height));

//  Optimised Code: 
System.out.println("The maximum water stored between two heights is "+ storeWaterOp(height));

//   Problem 6. Find if any pair in a sorted arraylist has target sum
   ArrayList<Integer> pairList= new ArrayList<>();
   pairList.add(2);
   pairList.add(3);
   pairList.add(8);
   pairList.add(10);
 System.out.println(pairSum(pairList, 20));
//  Optimised code 
 System.out.println(pairSumOp(pairList, 5));


    }
    }
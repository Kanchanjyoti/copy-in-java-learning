import java.util.*;
public class Greedy{
    public static void activitySelect(int[] start, int[] end){
    int maxAct= 0;
    ArrayList<Integer> arr= new ArrayList<>();
    maxAct =1;
    arr.add(0);
    int lastEnd= end[0];
    for(int i=1;i<end.length;i++){
        if(start[i]>= lastEnd){
            maxAct++;
            arr.add(i);
            lastEnd= end[i];
        }

    }
    for(int i=0; i< arr.size();i++){
        System.out.print("A"+ arr.get(i)+ " ");
    }
    System.out.println();
    }
    public static void main(String[] args){
        //  Activity selection 
        int[] startTime= {10,12,20};
        int[] EndTime= {20,25,30};
    activitySelect(startTime, EndTime);

    }
}
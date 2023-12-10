import java.util.*;
public class StackK {
  public static void pushInTheBottom(Stack<Integer> s, int number){
    if(s.isEmpty()){
        s.push(number);
        return;
    }
     int getTop= s.pop();
    pushInTheBottom(s, number);
    s.push(getTop);
}

    public static StringBuilder reverseString(String s){
       Stack<Character> ch= new Stack<>();
       for(int i=0; i<s.length(); i++){
           ch.push(s.charAt(i));
       }
       StringBuilder sb = new StringBuilder("");
       while(!ch.isEmpty()){
         sb.append(ch.pop());
       }
       return sb;
    }
    //  reverse the stack
     public static Stack reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return st;
        }
        int getTop= st.pop();
        reverseStack(st);
        pushInTheBottom(st, getTop);
        return st;
    }
    // Stock problem 
     public static void stackSpan(int stocks[], int span[]){
      span[0]= 1;
      Stack<Integer> s= new Stack<>();
      s.push(0);
      for(int i=1; i<stocks.length;i++){
          int currPrice= stocks[i];
      while(!s.isEmpty() && currPrice > stocks[s.peek()]){
         s.pop();
      }
      if(s.isEmpty()){
        span[i]= i+1;
      }
      else{
        int prevHigh= s.peek();
        span[i]= i- prevHigh;
      }
      s.push(i);
      }
    }
    // nextGreater problem 
     public static void nextGreater(int arr[], int newarr[]){
      Stack<Integer> s= new Stack<>();
          newarr[arr.length-1]= -1;
          s.push(arr[arr.length-1]);
          for(int i= arr.length-2;i>=0; i--){
             int currElement= arr[i];
             while(! s.isEmpty() && currElement > s.peek() ){
              s.pop();
             } 
             if(s.isEmpty()){
              newarr[i]= -1;
             }
             else{
              newarr[i]= s.peek();
             }
             s.push(currElement);
          }
     }
    //  for printing the array 
    public static void printarr(int arr[]){
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
       }
    }
    public static void main(String[] args){
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // push the number in the bottom of the stack
        pushInTheBottom(stack, 4);  
        while(! stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        String s= "abc";
        System.out.println(reverseString(s));

        // for stock prblem 
         int stocks[]= {100,80,70,85,75,90,100};
        int span[]= new int[stocks.length];
        stackSpan(stocks,span);
        printarr(span);
        //  for nest greater number in the array 
       int arr[]= {5,3,7,2,8,9,5};
       int newarr[]= new int[arr.length];
       nextGreater(arr, newarr);
       System.out.println();
       printarr(newarr);
    }
}
import java.util.*;
public class Queue {
    // implementation of queue array 
     public static int arr[];
     static public int front=0;
     static public int rear=-1;
     static public int size=0;
    
        Queue(int size){
        this.arr = new int[size];
        this.size = size;

        }
    

     static void add(int data){
        if((rear +1) == size){
           System.out.println("The queue is full");
           return;
        }
        rear++;
        arr[rear]= data;
    }
    public static int remove(){
        if(rear<front){
            System.out.println("queue is empty");
            return -1;
        }
        
            int value= arr[front];
            for(int i=0; i<rear; i++){
                arr[i]= arr[i+1];
            }      
            rear--;
            return value;
        
    }
    public static int peek(){
        return arr[front];
    }
   //   implementation of circular queue by array
  /*
 public class QueueS {
    static int front= -1;
    static int rear= -1;
    static int size=0;
    static int arr[];
    QueueS(int size){
        this.size= size;
        this.arr= new int[size];
    }
    public static void add(int data){
        if((rear+1)%size == front){
            System.out.println("the queue is full");
            return;
        }
        if (rear== -1){
            rear++;
            front++;
            arr[rear]= data;
        }
        else{
            rear= (rear+1) % size;
            arr[rear]= data;
        }
    }
    public static int remove(){
        if(rear== -1){
            System.out.println("the queue is empty");
            return -1;
        }
        int top =arr[front];
        arr[front]=0;
        if(front== rear){
            front= rear= -1;
        }
        else{
           front= (front+1)% size;
           
        }
        return top;
    }
    public static int peek(){
        return arr[front];
    }
*/
    public static void main(String[] args){
        Queue q= new Queue(4);
        q.add(1);
        System.out.println(arr[front]);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(arr[front]);
        System.out.println(q.peek());
    
//    implementation circular queue by array
     /*QueueS queue= new QueueS(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
       
        System.out.println(queue.peek());
        for(int i=0; i< size; i++){
            System.out.println(arr[i]+ " ");
        }*/
     }
    }

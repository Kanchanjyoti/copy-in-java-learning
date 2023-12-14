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
     }
    }
    
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

//   Implementation of queue using linkedlist 
    /*
    import java.util.*;
    public class QueueS {
    public static class Node{
         int data;
         Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void add(int data){
        Node newNode = new Node(data);
        if(head== null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public static int peek(){
        if(head==null){
            return -1;
        }
       return head.data;
       

    }
    public static int remove(){
        if(head==null){
            System.out.println("the queue is empty");
            return -1;
        }
        int top= head.data;
        if(head==tail){
            head= tail= null;
        }
        else{
            head= head.next;
        }
        return top;
    }

    public static void main(String[] args){
      QueueS queue = new QueueS();
      queue.add(1);
      queue.add(2);
      queue.add(3);
      System.out.println("head data:" + queue.peek());

      System.out.println("The element removed is :" + queue.remove());
      System.out.println("The element removed is :"+ queue.remove());
      System.out.println("The element removed is :"+ queue.remove());
      System.out.println("head data:" + queue.peek());
    }
}
*/
// imlimentation  of queue using java collection framework 
/* import java.util.Queue;
public class QueueS {
    public static void main(String[] args){
      Queue<Integer> q= new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      System.out.println(q.peek());
      System.out.println(q.remove());
    }
}
*/

/*
// Implementation of queue by using two stacks 
import java.util.*;

// implimentation of queue from stack
public class QueueS {

  public static class Queue {

    Stack<Integer> s = new Stack<>();

    public void add(int data) {
      s.add(data);
      return;
    }

    public int remove() {
      if (s.size() == 0) {
        System.out.println("the queue is empty");
        return 0;
      }
      if (s.size() == 1) {
        return s.pop();
      }
      int data = s.pop();
      int retVal = remove();
      s.push(data);
      return retVal;
    }
  }

  public static void main(String[] args) {
   Queue q= new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
  }
}
*/

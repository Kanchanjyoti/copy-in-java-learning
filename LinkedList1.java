public class LinkedList1{
   public class Node{
      int data;
      Node next;

      public Node(int data){
        this.data= data;
        this.next=null;
      }
   }
      Node head;
      Node tail;
      public static int size=0;  

   public void addFirst(int data){
     Node firstNode= new Node(data);
     if(head==null){
        head=tail=firstNode;
     }
     else{
        head=firstNode;
     }
    size++;
   }
   public void addLast(int data){
    Node lastNode= new Node(data);
    if(head==null){
        head=tail=lastNode;
    }
    else{
        tail=lastNode;
    }
    size++;
   }
  public void printList(){
    Node temp= head;
    while(temp!= null){
        System.out.print(temp.data + "->");
        temp= temp.next;
    }
    System.out.println("null");
  }
    
    public static void main(String[] args){
       LinkedList ll = new LinkedList();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(2);
       ll.addFirst(1);
       ll.addLast(3);
       ll.printList();
    }
}
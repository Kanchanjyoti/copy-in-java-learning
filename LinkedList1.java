public class LinkedList1 {
   public static class Node {
      static int data;
      Node next;
      public Node(int data) {
         this.data= data;
         this.next= null;
      }
   }
   public static Node head;
   public static Node tail;
   public static void addFirst(int data){
      Node firstNode = new Node(data);
      if(head== null){
         head= tail= firstNode;
         return;
      }
      firstNode.next= head;
      head= firstNode;

   }
   public static void addLast(int data){
      Node lastNode= new Node(data);
      if(head==null){
         head= tail= lastNode;
      }
      else{
        tail.next= lastNode;
        tail = lastNode;
      }
   }
   
   public static void removeLast(){
      if(head==null){
         System.out.println("The list is empty");
         return;
      }
      if(head==tail){
         head=tail=null;
         return;
      }
      
      Node temp= head;
      while(temp.next.next != null){
         temp= temp.next;
      }
      temp.next= null;
   }
   public static void printList(){
      Node temp = head;
      while(temp!= null){

         System.out.print(temp.data+ "->");
         temp= temp.next;
      }
      System.out.println("null");
   }
   public static void main(String[] args){
      LinkedList1 ll = new LinkedList1();
      ll.addFirst(3);
      ll.addLast(2);
      ll.addLast(3);
      // ll.addLast(4);
      // ll.addLast(5);
      ll.printList();

   }
}


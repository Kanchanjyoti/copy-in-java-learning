public class LinkedList{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
        Node head;
        Node tail;
        static int size=0;
       public void addFirst(int data){
        Node firstNode= new Node(data);

          if(head==null){
            head=tail=firstNode;
          }
          else{
            firstNode.next= head;
            head= firstNode;
          }
          size++;
          
        }
        public void addLast(int data){
            Node lastNode= new Node(data);
            if(head==null){
            head=tail=lastNode;
          }
          else{
            tail.next= lastNode;
            tail= lastNode;
          }
          size++;
        }

        public void printList(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data +"->");
                temp= temp.next;
            }
            System.out.print("null");
        }
        public void removeFirst(){
            if(head==null){
                System.out.print("list is empty");
                return;
            }
            else if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            size--;
        }
        public void removeLast(){
            if(head==null){
                System.out.print("List is empty");
                return;
            }
            else if(head==tail){
                head=tail=null;
            }
            else{
                Node temp= head;
                while(temp.next!= tail){
                    temp= temp.next;
                }
                tail= temp;
                temp.next=null;
            }
            size--;
        }

        // To search the element in linked list
        public int searchList(int key){
            Node temp= head;
            int counter=0;
            while(temp != null){
                if(temp.data ==key){
                    return counter;
                }
                temp=temp.next;
                counter++;
            }
            return -1;
        }

        public int searchRecursion(int key, Node head){
            if(head == null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            else{
               int idx= searchRecursion(key, head.next);
               return idx+1;
            }
        }


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("The index will be :"+ ll.searchRecursion(4, ll.head));
    }
    }

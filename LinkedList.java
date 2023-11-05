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
        // To insert the first node in a list
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

    //  To insert the last node in the list
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
        // To print the list
        public void printList(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data +"->");
                temp= temp.next;
            }
            System.out.print("null");
        }

        // To remove the first node in the list
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

        // Removing the last node of the list
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

        // Search using recursive method

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

        // Reversing a linked list
        public void reverseList(){
            Node prev = null;
            Node curr= tail= head;
            Node next;
            while(curr!=null){next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;}
            
        head = prev;
        }

        // Removing the Nth node from last
        public void delNthNode(int n){
            if(size==0){
                System.out.println("List is empty");
                return;
            }
            if(n==size){
                this.removeFirst();
                return;
            }
            if(n==0){
                this.removeLast();
                return;
            }
            Node temp = head;
            for(int i=0; i<(size-n-1);i++ ){
                temp= temp.next;
            }
            // removing the next given node
              temp.next= temp.next.next;
        }


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("The index will be :"+ ll.searchRecursion(4, ll.head));

        ll.reverseList();
        ll.printList();
        ll.delNthNode(3);
        ll.printList();
    }
    }

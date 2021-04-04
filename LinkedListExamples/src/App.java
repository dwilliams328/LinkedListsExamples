public class App {

    public static void main(String[] args) throws Exception {
                //Initialize linkedList
                SinglyLinkedList llist = new SinglyLinkedList();

                llist.push(10);
                llist.push(50);
                llist.push(5);
                llist.push(20);
                llist.push(39);
                llist.push(12);
                llist.push(26);
                llist.push(22);
        
                llist.printList();
        
                //Sort LL elements
                SelectionSort.sort(llist.head);

                System.out.println("Head: " + llist.head.data);
                System.out.println("Tail: " + llist.tail.data);

                llist.printList();

                //Search LL for x element
                System.out.println(SearchLL.search(llist.head, 26) + " In in the LinkedList");
                System.out.println(SearchLL.search(llist.head, 100) + " Not in List");
    }
}

//Construct LinkedList with push() mechanism 
class SinglyLinkedList{
    
    class Node{

        // Node(s) member variables for data & Random Access
        // reference to next node.
        int data;
        Node next;

        //Construct on instantiation
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //Head of list
    Node head;
    //Tail of list
    Node tail;

    //Size of LinkedList
    public static int counter = 0;

    // Use push() method to add Node at the top(head) of the 
    // 'Stack' represented by LinkedList
    public void push(int new_data)
    {
        //Allocate new node w/ data
        Node new_node = new Node(new_data);

        //Make next of new node as 'old' head ref
        new_node.next = head;

        //Move the head to point to appropriate new Node
        head = new_node;
        
        //Tail should remain fixed to the bottom of stack in push operation
        if(counter == 0){
            tail = new_node;
        }

        counter++;
    }

    public void printList() {
        Node temp = head;
        
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

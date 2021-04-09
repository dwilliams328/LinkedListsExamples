public class App {

    public static void main(String[] args) throws Exception {
                //Initialize linkedList
                SinglyLinkedList llist = new SinglyLinkedList();
                SinglyLinkedList llist2 = new SinglyLinkedList();

                //push data to LL Stack
                llist.push(10);
                llist.push(50);
                llist.push(5);
                llist.push(20);

                llist2.push(39);
                llist2.push(12);
                llist2.push(26);
                llist2.push(22);

                SelectionSort.sort(llist.head);
                llist.printList(llist.head);
                System.out.println("-------------------------");
                SelectionSort.sort(llist2.head);
                llist2.printList(llist2.head);

/*
                System.out.println("LL: ");
                llist.printList(llist.head);
                System.out.println("Head Node: " + llist.head.data);
                System.out.println("Tail Node: " + llist.tail.data);

                //Sort in place
                System.out.println("LL Sorted: ");
                SelectionSort.sort(llist.head);
                llist.printList(llist.head);
                System.out.println();

                System.out.println("Head Node: " + llist.head.data);
                System.out.println("Tail Node: " + llist.tail.data);
                System.out.println();

                //Search LL for x element
                System.out.println("Search for element: " + SearchLL.search(llist.head, 26) + " In in the LinkedList");
                System.out.println("Search for element: " + SearchLL.search(llist.head, 100) + " Not in List");
                System.out.println();

                //Save reference to reversed LinkList & print
                llist.head = ReverseLL.reverse(llist.head);
                System.out.println("Reversed LL: ");
                llist.printList(llist.head);
*/

    }
}

//Construct LinkedList with push() mechanism 
class SinglyLinkedList{

    //Head of list
    Node head;
    //Tail of list
    Node tail;
    //Size of LinkedList
    public static int counter = 0;

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
        
        //Tail should remain fixed to the bottom of stack in push operation, unless manually changed
        if(counter == 0){
            tail = new_node;
        }

        counter++;
    }

        /* Method to insert a node at 
    the end of the linked list */
    public void addToTail(int new_data) {
        if (head == null) {
            push(new_data);
        }
        else {
            //Create island Node for later assignments
            Node new_node = new Node(new_data);
            //Capture current Tail of list
            Node currentTail = tail;

            //Connect Nodes
            currentTail.next = new_node;

            //assign new node as tail
            tail = new_node;
        }
    }

    public void printList(Node head){
        //Capture head node
        Node temp = head;

        //visit every node connect & display content
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

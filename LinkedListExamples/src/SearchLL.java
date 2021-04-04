public class SearchLL extends SinglyLinkedList{

	// Write a linear sort program to search element in linked list
    public static int search(Node head, int x){

        //Initialize head pointer node as, current,
        // starting point of LL traversal.
        Node current = head;

        while(current != null){
            if(current.data == x){
                //data found, RETURN
                return x;
            }

            // Continue to next node in LL structure if reached
            current = current.next;

        }

        //Data not found
        return -1;
    }
}


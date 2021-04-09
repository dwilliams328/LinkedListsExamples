public class SelectionSort extends SinglyLinkedList{

	public static void sort(Node head) {

        //Reference to current Node
        Node temp = head;

        // Traverse the list of objects - Sorted set
        while(temp != null){
            Node min = temp;
            Node r = temp.next;

            // Traverse the unsorted sublist swap if left.data-item {'less than'} right.data-item
            while(r != null) {
                if (min.data > r.data){
                    min = r;
                }

                r = r.next;
            }

            // Swap Data
            int x = temp.data;
            temp.data = min.data;
            min.data = x;

            //move to next iteration
            temp = temp.next;
        }
	}
}

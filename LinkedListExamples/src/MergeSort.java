public class MergeSort extends SinglyLinkedList{
    public MergeSort(){
        super();
    }

    //Ascending Order
	public static void mergeSort(SinglyLinkedList L1, SinglyLinkedList L2) throws Exception {

        //Create List to store sorted values
        SinglyLinkedList sortedList = new SinglyLinkedList();
        
        //Add pointer at beginning of each list
        Node tempL1 = L1.head;
        Node tempL2 = L2.head;

        // Make sure both lists have data to compare.
        while(tempL1 != null && tempL2 != null){
            //Take minimum value of compare statement & add to sortedList
            if(tempL1.data <= tempL2.data){

                //Tail assigned to node add to list
                sortedList.addToTail(tempL1);

                //next from minimum value list
                tempL1 = tempL1.next;
            }
            else{
                sortedList.addToTail(tempL2);

                tempL2 = tempL2.next;
            }
        }

        // If either list run out, attach the remaining list to sortedList
        if(tempL1 == null){
            sortedList.tail.next = tempL2;
        }
        else{
            sortedList.tail.next = tempL1;
        }

        //set SortedList tail to last element in list.
        Node currentNode = sortedList.head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        //Found last node in sorted list
        sortedList.tail = currentNode;
    }
}

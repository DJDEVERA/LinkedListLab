package sdccd.edu.cisc191;

public class SinglyLinkedList<T> {

    class Node {

        T data;
        Node next;

    };

    /**
     * recursively finds k-th node, deletes, and returns new head
     *
     * @param head the node to start at
     * @param k the kth element to remove (first element at 0)
     * @return the new head node with the kth element removed
     */
    public Node remove(Node head, int k) {


        if (k == 0){
            // returns next element in list
            return head.next;
        }

        // removes element we want to remove and replaces it with next element
        head.next = remove(head.next, k-1);

        // return node
        return head;

    }

    /**
     *  inserts node at the beginning of the list
     * @param head the node to start at
     * @param new_data data to insert into the list
     * @return the new head node containing new_data followed with the rest of the linked list
     */
    public Node push(Node head, T new_data)
    {

        // initialize new node
        Node new_node = new Node();

        // push new_data to new_node
        new_node.data = new_data;

        // push head node to new_node
        new_node.next = head;

        // return new_node
        return new_node;

    }

    /**
     * recursively prints list starting from head
     * @param head the node to start at
     * @return a space separated string containing the data of each node starting from the head to the tail, end with a trailing space
     */
    public String toString(Node head)
    {

        // initialize new output string
        String output = "";
        // initialize new "current" node from head node
        Node current = head;


        while(current != null){

            // adds data from current node to output
            output += current.data;
            // adds empty space to output
            output += " ";
            // sets next value in node to current node
            current = current.next;
        }

        // returns output string
        return output;
    }

}

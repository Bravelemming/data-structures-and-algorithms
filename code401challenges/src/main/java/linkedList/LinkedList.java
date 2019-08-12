// Author: Jack Kinne
// challenge by: Codefellows
package linkedList;

public class LinkedList<T> {
    private Node head;
    private int nodeCount = 0;


    public LinkedList(T dataAdd) {
        head = new Node(dataAdd);
    }

    public void insertFront (T dataAdd ){
        //save pointer to head
        Node save = head;
        //create new node
        head = new Node(dataAdd);
        //set head's next node in the list
        head.next = save;
        //iterate number of nodes in list
        nodeCount++;
    }

    public boolean includes (T value){

        //track current
        Node current = head;
        //while current exists
        while(current != null)
        {
            //if data matches value, return true
            if (current.getData().equals(value) ) return true;
            //move to next node
            current = current.next;
        }
        return false;
    }

    public String toString()
    {
        //output string
        StringBuilder output = new StringBuilder("");
        //track current
        Node current = head;
        //while current exists
        while(current != null)
        {
            //append to output
            output.append( current.getData() + " " );
            //move to next node
            current = current.next;
        }
        return output.toString();
    }

    public static void main(String [] args) {
        LinkedList lawl = new LinkedList(1);
        lawl.insertFront(2);

        System.out.println(lawl.toString() );
    }

}//end class

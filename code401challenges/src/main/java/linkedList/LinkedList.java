// Author: Jack Kinne
// challenge by: Codefellows
package linkedList;

public class LinkedList<T> {
    private Node head;
    private int nodeCount = 0;

    public LinkedList( T dataAdd ) {
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

    public void insertRear (T dataAdd ){
        //track nodes
        Node old = head;
        Node current = head;

        //find last
        while(current != null){
            //move old forward
            old = current;
            //move to next node
            current = current.next;
        }
        //create new node
        current = new Node(dataAdd);
        //tie old node's next to new
        old.next = current;
        //iterate number of nodes in list
        nodeCount++;
    }

    public String insertBefore(T value, T newVal){
        //track nodes
        Node current = head;
        Node previous = head;
        Node save = head;

        //while there are nodes to search
        while(current != null) {
            //if data matches value, insert before
            if (current.getData().equals(value) ){
                //create new node
                current = new Node(newVal);
                //save previous nodes' next
                save = previous.next;
                //tie previous node's next to new
                previous.next = current;
                //set current to save
                current.next = save;
                //iterate number of nodes in list
                nodeCount++;
                return "node added.";
            }
            //move old forward
            previous = current;
            //move to next node
            current = current.next;
        }
        return "no matching value found.";
    }

    public String insertAfter(T value, T newVal){
        //track nodes
        Node current = head;
        Node save = head;

        //while there are nodes to search
        while(current != null) {
            //if data matches value, insert before
            if (current.getData().equals(value) ){

                //save current.next somewhere (pointER to 5)
                save = current.next;
                //node position is current.next
                current.next = new Node(newVal);
                //tie next to current.next
                current.next.next = save;

                //iterate number of nodes in list
                nodeCount++;
                return "node added.";
            }
            //move to next node
            current = current.next;
        }
        return "no matching value found.";
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

    public String toString() {
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
        //System.out.println(lawl.toString() );
    }

}//end class

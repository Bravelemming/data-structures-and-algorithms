// Author: Jack Kinne
// challenge by: Codefellows
package linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private int nodeCount = 0;

    //constructor
    public LinkedList( T dataAdd ) {
        head = new Node<T>(dataAdd);
    }

    //overloaded constructor
    public LinkedList() {
        head = null;
    }

    public void insertFront (T dataAdd ){
        //save pointer to head
        Node save = head;
        //create new node
        head = new Node<>(dataAdd);
        //set head's next node in the list
        head.next = save;
        //iterate number of nodes in list
        nodeCount++;

        //save previous for old node heads
        save.previous = head;
    }

    public void insertRear (T dataAdd ){
        //track nodes
        Node old = head;
        Node current = head;

        //find last
        while(current != null){
            //TODO: set current.previous as current node
            //current.previous = old;

            //move old forward
            old = current;
            //move to next node
            current = current.next;
        }
        //create new node
        current = new Node<>(dataAdd);
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
                current = new Node<>(newVal);
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
            //TODO: save previous in node
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
                current.next = new Node<>(newVal);
                //tie next to current.next
                current.next.next = save;

                //iterate number of nodes in list
                nodeCount++;
                return "node added.";
            }
            //move to next node
            current = current.next;
            //TODO: save previous in node
        }
        return "no matching value found.";
    }

    //find kth node from end.  return value
    public String kthFromEnd(int k){
        if (k < 0){
            throw new IllegalArgumentException("k cannot be negative");
        }
        //track current
        Node current = head;
        //track old
        Node old = head;
        //while current exists
        while(current != null)
        {
            old = current;
            //move to next node until we find the last
            current = current.next;
        }
        //walk back k nodes
        for(int i = 0 ; i < k; i++){
            old = old.previous;
        }
        //return that value
        return old.getData().toString();
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
        Node<T> current = head;
        //while current exists
        while(current != null)
        {
            //append to output
            output.append( current.getData() + " " );
            //System.out.println(current.getData() );
            //move to next node
            current = current.next;
        }

        return output.toString();
    }

    // Write a function called mergeLists which takes two linked lists as arguments.
    // Zip the two linked lists together into one so that the nodes alternate between
    // the two lists and return a reference to the head of the zipped list. Try and
    // keep additional space down to O(1). You have access to the Node class and all
    // the properties on the Linked List class as well as the methods created
    // in previous challenges.

    public static <P> LinkedList<P> mergeLists(LinkedList<P>s1, LinkedList<P> s2){
        //track nodes
        Node <P>s1current = s1.head;
        Node <P>s2current = s2.head;
        LinkedList<P> s3 = new LinkedList<P>(null);
        //throw an error if either LL is null
        if (s1current == null || s2current == null ) throw new IllegalArgumentException("Linked list cannot be null");

        // while there is a node on either
        while (s1current != null || s2current != null ){
            if(s1current != null){
                //push new node
                s3.insertRear(s1current.getData() );
                //move to next node
                s1current = s1current.next;
            }
            if(s2current != null){
                //push new node
                s3.insertRear(s2current.getData() );
                //move to next node
                s2current = s2current.next;
            }
        }
        return s3;
    }

    public static void main(String [] args) {
        LinkedList<Integer> lawl = new LinkedList<>(1);
        lawl.insertFront(2);
        lawl.insertFront(3);
        lawl.insertFront(4);
        System.out.println(lawl.toString() );
        System.out.println(lawl.kthFromEnd(1));
        //System.out.println( lawl.head.next.next.previous.getData());
    }

}//end class

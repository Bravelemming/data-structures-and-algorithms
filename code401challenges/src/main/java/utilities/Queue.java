package utilities;

public class Queue<T> {
    //variables
    Node front;
    Node rear;
    int nodeCount = 0;

    //constructor
    public Queue(){
        this.front = null;
        this.rear = null;
    }

    //methods
    public void enqueue(T dataAdd){
        //save pointer to top of stack (first iteration is null)
        Node save = this.front;
        //create new node
        this.front = new Node<>(dataAdd);
        //set head's next node in the list
        front.next = save;
        //add number of nodes in list
        nodeCount++;
        //set previous node
        if (front.next != null) front.next.previous = front;
        //if the next node is null, this is the rear.
        if (front.next == null) this.rear = front;
    }

    public T dequeue(){
        // if rear is null, return.
        if (this.rear == null) return null;
        //save data from rear
        T data = (T) this.rear.getData();
        //if there is a previous node, set that to rear.
        if (this.rear.previous != null ) {
            //set rear's next to null
            this.rear.previous.next = null;
            //set rear to previous
            this.rear = this.rear.previous;
            //decrease nodes
            this.nodeCount--;
        }
        //if there is no previous, reset structure
        else{
            this.front = null;
            this.rear = null;
            this.nodeCount = 0;
        }
        return data;
    }

    public T peek (){
        //if top is not null
        if (this.rear != null) {
            //return data
            final T data = (T) this.rear.getData();
            return data;
        }
        else {
            return null;
        }
    }

    public String toString() {
        //output string
        StringBuilder output = new StringBuilder("");
        //track current
        Node current = front;
        //while current exists
        while(current != null) {
            //append to output
            output.append( current.getData() + " " );
            //move to next node
            current = current.next;
        }
        return output.toString();
    }

    public static void main(String [] args){
        //instance
        Queue<Integer> queue = new Queue<>();
        //add data
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue: " +queue.toString() );
        System.out.println("peek: "+queue.peek());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("peek: "+queue.peek());
        System.out.println("Queue: " +queue.toString() );
    }

}

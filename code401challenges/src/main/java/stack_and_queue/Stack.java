package stack_and_queue;

public class Stack<T> {
    private Node top;
    int nodeCount = 0;

    //constructor
    public Stack() {
        this.top = null;
    }

    public void push (T dataAdd ){
        //save pointer to top of stack (first iteration is null)
        Node save = this.top;
        //create new node
        this.top = new Node<>(dataAdd);
        //set head's next node in the list
        top.next = save;
        //add number of nodes in list
        nodeCount++;
        //save previous for old node heads
        if (top.next != null) top.next.previous = top;
    }

    public T pop (){
        //save pointer to top's next
        Node save = top.next;
        //peek our value
        final T peeked = this.peek();
        //if value not null
        if (peeked != null){
            //set top to next
            this.top = top.next;
            //reduce number of nodes in list
            nodeCount--;
            //return value
            return peeked;
        }
        return null;
    }

    public T peek (){
        //if top is not null
        if (this.top != null) {
            //return data
            final T data = (T) this.top.getData();
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
        Node current = top;
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
        Stack<Integer> stack = new Stack<>();
        //add data
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack to string: " +stack.toString() );
        System.out.println("peek: "+stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: "+stack.peek());
        System.out.println("stack to string: " +stack.toString() );

    }
}

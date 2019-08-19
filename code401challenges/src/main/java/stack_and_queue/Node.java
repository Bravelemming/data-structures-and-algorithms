package stack_and_queue;

public class Node <T> {
    // variables
    public Node previous;
    public Node next;
    private T data;
    //constructor
    public Node(T dataAdd) {
        data = dataAdd;
    }
    //methods
    public T getData() {
        return data;
    }
}

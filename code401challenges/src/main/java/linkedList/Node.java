// Author: Jack Kinne
// challenge by: Codefellows
// Create a Node class that has properties for the value stored in the Node,
// and a pointer to the next Node.

package linkedList;

public class Node<T> {
    public Node next;
    private T data;

    public Node(T dataAdd) {
        data = dataAdd;
    }

    public T getData() {
        return data;
    }
}


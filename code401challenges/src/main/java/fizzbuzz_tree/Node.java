package fizzbuzz_tree;

public class Node <T> {
    // variables
    public Node left;
    public Node right;

    private T data;

    //constructor
    public Node(T dataAdd) {
        data = dataAdd;
    }

    //constructor overloaded for reasons okay
    public Node(T dataAdd, Node left, Node right) {
        this.data = dataAdd;
        this.left = left;
        this.right = right;
    }
    //methods
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
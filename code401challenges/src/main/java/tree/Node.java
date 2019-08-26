package tree;

public class Node <T> {
    // variables
    public Node left;
    public Node right;

    public void setData(T data) {
        this.data = data;
    }

    private T data;

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

    //constructor
    public Node(T dataAdd) {
        data = dataAdd;
    }
    //methods
    public T getData() {
        return data;
    }
}

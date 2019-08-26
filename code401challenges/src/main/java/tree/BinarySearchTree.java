package tree;

public class BinarySearchTree <T extends Comparable<T>> extends Tree {
    //constructor
    public BinarySearchTree (){
         super();
    }

    //methods
    public void add(T data){
        this.root = addNode(this.root, data);
    }
    //recusive add helper, null, left, right.
    public Node<T> addNode(Node<T> current, T data){
        //if root is null, set root.
        if (current == null) {
            return new Node<>(data);
        }
        //go right if less
        else if ( data.compareTo(current.getData()) > 0 ) {
            current.right = addNode(current.right, data);
        }
        //go left if equal or more
        else if ( data.compareTo(current.getData()) <= 0) {
            current.left = addNode(current.left, data);
        }
        return current;
    }

    //contains, recusive
    boolean contains (Node current, T data){
        //if null, return false.
        if (current == null){
            return false;
        }
        //if this node is equal
        else if ( data.compareTo((T) current.getData())  == 0) {
            return true;
        }
        //go right if less
        else if ( data.compareTo((T) current.getData())  < 0) {
            contains(current.right, data);
        }
        //go left if equal or more
        else if ( data.compareTo((T) current.getData())  >= 0) {
            contains(current.left, data);
        }
        return true;
    }


}

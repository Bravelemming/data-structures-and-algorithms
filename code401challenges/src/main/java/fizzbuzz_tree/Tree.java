package fizzbuzz_tree;

import java.util.ArrayList;

public class Tree <T> {
    //variables
    public Node root;

    //constructor
    public Tree () {
        this.root = null;
    }

    //search methods
    public ArrayList<T> pre() {
        ArrayList<T> arr = new ArrayList<>();
        preOrder(this.root, arr);
        return arr;
    }
    //me l r
    public void preOrder(Node current, ArrayList<T> arr){
        //base exit condition
        if (current != null){
            arr.add((T) current.getData()); // me
            preOrder(current.left, arr ); // left
            preOrder(current.right, arr); // right
        }
    }

    public ArrayList<T> in() {
        ArrayList<T> arr = new ArrayList<>();
        inOrder(this.root, arr);
        return arr;
    }
    //l me r
    public void inOrder(Node current, ArrayList<T> arr){
        //base exit condition
        if (current != null){
            inOrder(current.left, arr ); // left
            System.out.println(current.getData());
            arr.add((T) current.getData()); // me
            inOrder(current.right, arr); // right
        }
    }

    //l r me
    public ArrayList<T> post() {
        ArrayList<T> arr = new ArrayList<>();
        postOrder(this.root, arr);
        return arr;
    }
    public void postOrder(Node current, ArrayList<T> arr){
        //base exit condition
        if (current != null){
            postOrder(current.left, arr ); // left
            postOrder(current.right, arr); // right
            arr.add((T) current.getData()); // me
        }
    }

}


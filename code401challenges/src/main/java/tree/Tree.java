package tree;

import java.util.ArrayList;
import utilities.Queue;

public class Tree <T> {
    //variables
    public Node root;
    public int max = 0;

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

    public ArrayList<T> breadthFirst(){
        //vars
        Queue<Node<T>> q = new Queue<>();
        ArrayList<T> o = new ArrayList<>();
        //base
        if (this.root != null) q.enqueue(this.root);
        //iterate queue
        while(q.peek() != null){
            //pop que, add to output
            Node current = q.dequeue();
            o.add((T) current.getData());
            //push two children of pop to que
            if(current.left != null) q.enqueue(current.left);
            if(current.right != null) q.enqueue(current.right);
        }
        return o;
    }

    public int findMax(Node current){
        //base exit condition
        if (current != null){
            findMax(current.left); // left
            if (current.getData() != null) {
                if ((int) current.getData() > this.getMax()) {
                    this.setMax((int) current.getData());
                }
            }// me
            findMax(current.right); // right
        }
        return this.getMax();
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

package treeIntersection;

import tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;


public class TreeIntersection {

    //vars
    List<Integer> joins;
    BinarySearchTree<Integer> bst1;
    BinarySearchTree<Integer> bst2;
    //cons
    public TreeIntersection(BinarySearchTree<Integer> bst1, BinarySearchTree<Integer> bst2){
        this.bst1 = bst1;
        this.bst2 = bst2;
        this.joins =  findJoins();
    }

    //methods
    public List<Integer> findJoins(){

        List<Integer> output = new ArrayList<>();

        List<Integer> alone = getBst1().in();
        List<Integer> altwo = getBst2().in();

        for (Integer value : alone){
            if (alone.contains(value) && altwo.contains(value)) {
                output.add(value);
            }
        }
        return output;
    }

    //gets and sets
    public List<Integer> getJoins() {
        return joins;
    }

    public void setJoins(List<Integer> joins) {
        this.joins = joins;
    }

    public BinarySearchTree<Integer> getBst1() {
        return bst1;
    }

    public void setBst1(BinarySearchTree<Integer> bst1) {
        this.bst1 = bst1;
    }

    public BinarySearchTree<Integer> getBst2() {
        return bst2;
    }

    public void setBst2(BinarySearchTree<Integer> bst2) {
        this.bst2 = bst2;
    }
}

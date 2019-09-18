package left_join;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LeftJoin {

    //vars
    HashMap<String, String> left;
    HashMap<String, String> right;
    Set<String> leftKeys;
    ArrayList<List<String>> output = new ArrayList<>();

    //constructor
    public LeftJoin(HashMap<String, String> left, HashMap<String, String> right){
        this.left = left;
        this.right = right;
        this.leftKeys = left.keySet();

    }

    //methods
    public ArrayList<List<String>> leftJoinFromTwoHashmaps(){
        for (String key : getLeftKeys()){
            //make a row
            List<String> row = new ArrayList<>();
            //push key and left value into row
            row.add(key);
            row.add(getLeft().get(key));

            if(getRight().containsKey(key)){
                String value = getRight().get(key);
                //push right value into row
                row.add(value);
            }
            //push row into output arraylist
            output.add(row);
        }
        return output;
    }


    //gets and sets

    public HashMap<String, String> getLeft() {
        return left;
    }

    public void setLeft(HashMap<String, String> left) {
        this.left = left;
    }

    public HashMap<String, String> getRight() {
        return right;
    }

    public void setRight(HashMap<String, String> right) {
        this.right = right;
    }

    public Set<String> getLeftKeys() {
        return leftKeys;
    }

    public void setLeftKeys(Set<String> leftKeys) {
        this.leftKeys = leftKeys;
    }
}

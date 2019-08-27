package fizzbuzz_tree;

public class FizzBuzzTree extends Tree <Object>{
    //variables

    //constructor
    public FizzBuzzTree (){
        super();
    }
    //methods
    public FizzBuzzTree wrapper (){
        FizzBuzzTree tree = new FizzBuzzTree();
        recurse(this.root, tree);
        return tree;
    }
    public void recurse(Node current, FizzBuzzTree tree){
        //base exit condition
        if (current != null){
            recurse(current.left, tree ); // left
            fizzy( current, tree ); // me
            recurse(current.right, tree ); // right
        }
    }
    public void fizzy(Node current, FizzBuzzTree tree){
        int data = (int) current.getData();
        if ( data % 5 == 0 && data % 3 == 0 ) {
            current.setData("fizzbuzz");
        }
        else if ( data % 5 == 0 ) {
            current.setData("fizz");
        }
        else if ( data % 3 == 0 ) {
            current.setData("buzz");
        }
        else {
            current.setData(data);
        }
    }
}

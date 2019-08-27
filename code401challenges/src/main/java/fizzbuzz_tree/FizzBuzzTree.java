package fizzbuzz_tree;

public class FizzBuzzTree<Object> extends BinarySearchTree{
    //variables

    //constructor
    public FizzBuzzTree (){
        super();
    }
    //methods
    public FizzBuzzTree<Object> wrapper (){
        FizzBuzzTree<Object> tree = new FizzBuzzTree<>();
        recurse(this.root, tree);
        return tree;
    }
    public void recurse(Node current, FizzBuzzTree<Object> tree){
        //base exit condition
        if (current != null){
            recurse(current.left, tree ); // left
            fizzy( current, tree ); // me
            recurse(current.right, tree ); // right
        }
    }
    public void fizzy(Node current, FizzBuzzTree<Object> tree){
        int data = (int) current.getData();
        if ( data % 5 == 0 && data % 3 == 0 ) {
            tree.add("fizzbuzz");
        }
        else if ( data % 5 == 0 ) {
            tree.add("fizzbuzz");
        }
        else if ( data % 3 == 0 ) {
            tree.add("fizzbuzz");
        }
        else {
            tree.add(data);
        }
    }
}

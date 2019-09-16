package repeated_word;

public class Hashtable {
    //variables
    private Node[] map;
    //constructor
    public Hashtable(int size) {
        map = new Node[size];
    }
    //methods
    // hash()
    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for( int i = 0; i<letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = ( hashValue * 491 ) % map.length;
        return hashValue;
    }

    // set()
    public void set(String key, String value) {
        //find hash key
        int hashKey = hash(key);
        //add the node
        if( this.map[hashKey] == null ) {
            map[hashKey] = new Node(key, value);
        }
        //or set next node at that location
        else {
            //check if next is null,
            Node temp = deeperFindLast(this.map[hashKey]);
            Node a = new Node(key, value);
            temp.setNext(a);
        }
        //check for collisions
        //System.out.println(key + " " + hashKey);
    }

    // get()
    public String get(String key) {
        // hash the key (should give me the same thing)
        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            // recursively walk the nodes, send back value
            return deeper(key, this.map[hashKey]).getValue();
        }
        return null;
    }

    //helper function to iterate the nodes, looking for a matching key.
    protected Node deeperFindLast(Node node){
        //base case exit
        if (node.getNext() == null) return node;
        return deeperFindLast(node.getNext());

    }


    //helper function to iterate the nodes, looking for a matching key.
    protected Node deeper(String key, Node node){
        //base case exit
        if (node != null){
            //if the keys are the same, return value.
            if ( node.getKey().equals(key) ){
                //System.out.println("node value correct at: " + node.getValue() );
                return node;
            }
            //recurse
            else {
                //System.out.println("node value not correct at: " + node.getValue() );
                return deeper(key, node.getNext());
            }
        }
        return null;
    }

    // has()
    public boolean has(String key) {
        int hashKey = hash(key);
        //if hashmap has a node there
        if(this.map[hashKey] != null ) {
            // recursively walk the nodes, and if the value is there, return.
            return ( deeper(key, this.map[hashKey]) != null );
        }
        return false;
    }
    // TODO: Maybe we add this later? tooManyCollisions()
}

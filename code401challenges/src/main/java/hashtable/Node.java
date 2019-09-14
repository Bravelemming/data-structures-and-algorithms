package hashtable;

public class Node {
    //variables
    private String key;
    private String value;
    private Node next;
    //constructor
    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
    //gets and sets
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

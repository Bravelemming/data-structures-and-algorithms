package repeated_word;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Node a = new Node("a", "a");
    Node b = new Node("b", "b");
    Node c = new Node("c", "c");



    @Test
    public void deeperTest() {

        Hashtable h = new Hashtable(2);

        a.setNext(b);
        b.setNext(c);

        Node r = h.deeper("b", a);
        System.out.println( r.getValue() );

    }
}
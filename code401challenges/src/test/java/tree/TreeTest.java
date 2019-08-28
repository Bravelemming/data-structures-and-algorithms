package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    Tree<Integer> t = new Tree<>();

    Node<Integer> na2a = new Node<>(null);
    Node<Integer> na2b = new Node<>(9);

    Node<Integer> na1a = new Node<>(2);
    Node<Integer> na1b = new Node<>(6);

    Node<Integer> na1 = new Node<>(7, na1a, na1b);
    Node<Integer> na2 = new Node<>(5, na2a, na2b);
    Node<Integer> na = new Node<>(2, na1, na2);


    @Before
    public void setUp() throws Exception {
        t.root = na;
    }

    @Test
    public void breadthFirst() {
       String actual = t.breadthFirst().toString();
        String expected = "[2, 7, 5, 2, 6, null, 9]";

        assertEquals(expected,actual);
    }
    @Test
    public void breadthFirstNull() {
        Tree<Integer> tt = new Tree<>();

        String actual = tt.breadthFirst().toString();
        String expected = "[]";

        assertEquals(expected,actual);
    }
}
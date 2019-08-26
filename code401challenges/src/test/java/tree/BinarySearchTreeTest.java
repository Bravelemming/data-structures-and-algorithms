package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> t = new BinarySearchTree<>();

    @Test
    public void instantiateNullTree() {
        assertNull(t.root);
    }

    @Test
    public void add() {
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        assertNotNull(t);
    }

    @Test
    public void addNode() {
        Node r = t.addNode(t.root, 1);
        assertNotNull(t);
    }

    @Test
    public void contains() {
        t.add(1);
        assertTrue(t.contains(t.root,1));
    }

    @Test
    public void preorder() {
        t.add(5);
        t.add(1);
        t.add(3);
        ArrayList<Integer> expected;
        expected = t.pre();

        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(5);
        actual.add(1);
        actual.add(3);

        assertEquals(expected, actual);
    }

    @Test
    public void inorder() {
        t.add(3);
        t.add(2);
        t.add(5);
        t.add(4);
        t.add(7);
        t.add(8);
        ArrayList<Integer> actual;
        actual = t.in();

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(7);
        expected.add(8);

        assertEquals(expected, actual);
    }

    @Test
    public void postorder() {
        t.add(5);
        t.add(1);
        t.add(3);
        ArrayList<Integer> expected;
        expected = t.post();

        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(3);
        actual.add(1);
        actual.add(5);

        assertEquals(expected, actual);
    }

}
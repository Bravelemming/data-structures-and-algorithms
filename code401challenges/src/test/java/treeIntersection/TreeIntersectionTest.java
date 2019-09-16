package treeIntersection;

import org.junit.Before;
import org.junit.Test;
import tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();
    BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();


    @Before
    public void setUp() throws Exception {
        bst1.add(1);
        bst1.add(2);
        bst1.add(3);
        bst1.add(4);

        bst2.add(3);
        bst2.add(4);
    }

    @Test
    public void testJoins() {
        TreeIntersection t = new TreeIntersection(bst1, bst2);

        List<Integer> actual = t.getJoins();
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);

        assertEquals(expected, actual);
//        for (Integer value : t.getJoins()){
//            System.out.println(value);
//        }

    }

    @Test
    public void testJoinsFail() {

        BinarySearchTree<Integer> bst3 = new BinarySearchTree<>();
        BinarySearchTree<Integer> bst4 = new BinarySearchTree<>();

        bst3.add(1);
        bst3.add(2);
        bst3.add(3);
        bst3.add(4);

        bst4.add(5);
        bst4.add(6);


        TreeIntersection tt = new TreeIntersection(bst3, bst4);

        List<Integer> actual = tt.getJoins();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
//        for (Integer value : t.getJoins()){
//            System.out.println(value);
//        }

    }
}
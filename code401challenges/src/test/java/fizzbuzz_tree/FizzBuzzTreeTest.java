package fizzbuzz_tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    FizzBuzzTree f = new FizzBuzzTree();

    @Before
    public void setUp() throws Exception {
        Node<Object> nodes = new Node<>(3,
                new Node<>(2,
                        new Node<>(7, null, null),
                        null),
                new Node<>(15, null, null)
        );

        f.root = nodes;

    }


    @Test
    public void wrapper() {
        f.wrapper();
        //FizzBuzzTree fizzy = f.wrapper();
        ArrayList<Object> arr = f.in();

        //FizzBuzzTree o = f.wrapper();
        String actual = arr.toString();
        String expected = "[7, 2, buzz, fizzbuzz]";
        //System.out.println(arr.toString() );
        assertEquals(expected, actual);
    }

    @Test
    public void nullcheck() {
        FizzBuzzTree nc = new FizzBuzzTree();
        nc.wrapper();
        //FizzBuzzTree fizzy = f.wrapper();
        ArrayList<Object> arr = nc.in();

        //FizzBuzzTree o = f.wrapper();
        String actual = arr.toString();
        String expected = "[]";
        //System.out.println(arr.toString() );
        assertEquals(expected, actual);
    }
}
package fizzbuzz_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    FizzBuzzTree<Object> f = new FizzBuzzTree<>();

    @Test
    public void wrapper() {
        f.add(5);
        f.add(2);
        f.add(3);
        f.add(15);

        FizzBuzzTree<Object> o = f.wrapper();

        //System.out.println(o.toString() );

    }
}
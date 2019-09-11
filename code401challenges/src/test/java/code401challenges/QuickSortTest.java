package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void quickSort() {

        //array
        int[] test = {456, 56, 123, 546, 0, 1};

        QuickSort.quickSort(test, 456, 1);

        QuickSort.toString(test);

        int[] expected = {0, 1, 56, 123, 456, 546};
        assertArrayEquals(expected, test);
    }

}
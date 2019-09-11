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
        int[] test = {56, 23, 46, 0, 1};

        QuickSort.quickSort(test, 0, test.length-1 );

        QuickSort.toString(test);

        int[] expected = {0, 1, 23, 46, 56};
        assertArrayEquals(expected, test);
    }

}
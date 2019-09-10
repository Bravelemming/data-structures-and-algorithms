package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {

        //array
        int[] test = {456, 56, 123, 546, 0, 1};

        MergeSort.mergeSort(test);

//        MergeSort.toString(test);

        int expected[] = {0, 1, 56, 123, 456, 546};
        assertArrayEquals(expected, test);
    }
}
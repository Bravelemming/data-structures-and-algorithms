package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {

        int test[] = {456, 56, 123, 546, 0, 1};

        MergeSort.mergeSort(test);

        MergeSort.toString(test);
    }
}
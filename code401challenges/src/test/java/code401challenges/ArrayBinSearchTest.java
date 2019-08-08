package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayBinSearchTest {

    @Test
    public void arrayBinarySearch() {
        int[] intArray = new int[]{ 1,2,3,4,5 };
        int key = 4;
        assertTrue(ArrayBinSearch.arrayBinarySearch(intArray,key)==3);
    }
    @Test
    public void arrayBinarySearchKeyNotInArray() {
        int[] intArray = new int[]{ 1,2,3,4,5,6 };
        int key = 7;
        assertFalse(ArrayBinSearch.arrayBinarySearch(intArray,key)==3);
    }
}
package code401challenges;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class InsertionSortTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void insertionSortTest() {
        int[] intArray = new int[]{ 1,2,8,4,5,6,7,19,9,10 };
        int[] expected = new int[]{ 1,2,4,5,6,7,8,9,10,19 };
        int[] arr = InsertionSort.insertionSort(intArray);
        //comment
        System.out.println("The array is:");
        for (int number : arr) {
            System.out.println("Number = " + number);
        }

        assertArrayEquals(arr, expected);
    }
}
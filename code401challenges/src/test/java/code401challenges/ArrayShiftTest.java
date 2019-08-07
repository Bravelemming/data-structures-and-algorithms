package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void arrayShift() {
        int[] intArray = new int[]{ 1,2,3,4 };
        int[] expectedArray = new int[]{ 1,2,5,3,4 };
        assertArrayEquals(expectedArray, ArrayShift.arrayShift(intArray,5));
    }
}
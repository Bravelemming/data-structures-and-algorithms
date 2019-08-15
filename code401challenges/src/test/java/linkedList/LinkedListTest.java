package linkedList;

import org.junit.Test;

import static linkedList.LinkedList.mergeLists;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insertFront() {

        LinkedList lawl = new LinkedList(1);
        lawl.insertFront(2);

        String actual = lawl.toString();
        String expected = "2 1 ";

        assertEquals(expected, actual);
    }

    @Test
    public void includes() {
        LinkedList lawl = new LinkedList(1);
        lawl.insertFront(2);

        boolean actual = lawl.includes(3);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        LinkedList lawl = new LinkedList("hello");

        lawl.insertFront("sparta");
        lawl.insertFront("is");
        lawl.insertFront("this");
        lawl.insertFront("world");

        String actual = lawl.toString();
        String expected = "world this is sparta hello ";

        assertEquals(expected, actual);
    }

    @Test
    public void insertRearTest() {
        LinkedList lawl = new LinkedList(0);

        lawl.insertRear(1);
        lawl.insertRear(2);
        lawl.insertRear(3);
        lawl.insertRear(4);
        lawl.insertRear(5);

        String actual = lawl.toString();
        String expected = "0 1 2 3 4 5 ";

        assertEquals(expected, actual);
    }

    @Test
    public void insertBeforeTest() {
        LinkedList lawl = new LinkedList(0);

        lawl.insertRear(1);
        lawl.insertRear(2);
        lawl.insertRear(3);
        lawl.insertRear(4);
        lawl.insertRear(5);

        lawl.insertBefore(4, 6);

        String actual = lawl.toString();
        String expected = "0 1 2 3 6 4 5 ";

        assertEquals(expected, actual);
    }

    @Test
    public void insertAfterTest() {
        LinkedList lawl = new LinkedList(0);

        lawl.insertRear(1);
        lawl.insertRear(2);
        lawl.insertRear(3);
        lawl.insertRear(4);
        lawl.insertRear(5);

        lawl.insertAfter(4, 6);

        String actual = lawl.toString();
        String expected = "0 1 2 3 4 6 5 ";

        assertEquals(expected, actual);
    }

    @Test
    public void kthFromEnd() {
        LinkedList lawl = new LinkedList(1);
        lawl.insertFront(2);
        lawl.insertFront(3);
        lawl.insertFront(4);

        String expected = lawl.kthFromEnd(1);
        String actual = "2";

        assertEquals(expected, actual);
    }

    @Test (expected=IllegalArgumentException.class)
    public void kthFromEndOutOfBounds() {
        LinkedList lawl = new LinkedList(1);
        lawl.insertFront(2);
        lawl.insertFront(3);
        lawl.insertFront(4);

        String expected = lawl.kthFromEnd(-1);
        int actual = 0;

        //LinkedListTest instance = new LinkedListTest();
        //int expResult = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void mergeListsTest() {
        LinkedList<Integer> s1 = new LinkedList<>(1);
        LinkedList<Integer> s2 = new LinkedList<>(6);

        s1.insertFront(1);
        s1.insertFront(1);
        s1.insertFront(1);

        s2.insertFront(6);
        s2.insertFront(6);
        s2.insertFront(6);

        //LinkedList s3 = new LinkedList(1);

        s1.insertFront(1);
        s2.insertFront(6);

        s1.insertFront(1);
        s2.insertFront(6);

        s1.insertFront(1);
        s2.insertFront(6);

        LinkedList actual = mergeLists(s1,s2);
        String expected = "null 1 6 1 6 1 6 1 6 1 6 1 6 1 6 ";

        //System.out.println(s3);

        assertEquals( expected, actual.toString() );
    }

    @Test (expected=IllegalArgumentException.class)
    public void mergeListsTestNullValue() {
        LinkedList s1 = new LinkedList(1);
        LinkedList s2 = new LinkedList();
        s1.insertFront(2);
        s1.insertFront(3);
        s1.insertFront(4);

        LinkedList expected = mergeLists(s1,s2);
        int actual = 0;

        assertEquals(expected, actual);
    }
}
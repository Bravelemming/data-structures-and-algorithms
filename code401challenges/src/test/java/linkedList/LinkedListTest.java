package linkedList;

import org.junit.Test;

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
}
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
}
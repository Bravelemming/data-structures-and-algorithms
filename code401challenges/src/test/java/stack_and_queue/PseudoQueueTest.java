package stack_and_queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue<Integer> q1 = new PseudoQueue<>();

    @Before
    public void setUp() throws Exception {
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);

        int out = q1.dequeue();
        int out2 = q1.dequeue();

        q1.enqueue(4);
        q1.enqueue(5);

        int out3 = q1.dequeue();
        int out4 = q1.dequeue();
    }

    @Test
    public void enqueue() {
        q1.enqueue(6);
        int expected = q1.dequeue();
        int actual = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void dequeue() {
        int throwaway = q1.dequeue();
        q1.enqueue(7);
        int expected = q1.dequeue();
        int actual = 7;
        assertEquals(expected, actual);
    }

    @Test (expected=NullPointerException.class )
    public void dequeueNull() {
        q1.dequeue();
        q1.enqueue(7);
        q1.dequeue();

        String expected = q1.s1.peek().toString();
        String actual = "";
        assertEquals(expected, actual);
    }
}
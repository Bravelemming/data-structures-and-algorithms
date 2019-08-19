package stack_and_queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue<Integer> queueInt = new Queue<>();
    Queue<String> queueString = new Queue<>();

    @Before
    public void setUp() throws Exception {

        queueInt.enqueue(1);
        queueInt.enqueue(2);
        queueInt.enqueue(3);

        queueString.enqueue("Prepare to die.");
        queueString.enqueue("You killed my father.");
        queueString.enqueue("Enigo Montoya.");
        queueString.enqueue("My name is");
        queueString.enqueue("Hello.");

    }

    @Test
    public void qIntTest() {
        String expected = queueInt.toString();
        String actual = "3 2 1 ";
        assertEquals(expected, actual);
    }

    @Test
    public void qStrTest() {
        String expected = queueString.toString();
        String actual = "Hello. My name is Enigo Montoya. You killed my father. Prepare to die. ";
        assertEquals(expected, actual);
    }

    @Test
    public void deqInt() {
        queueInt.dequeue();
        String expected = queueInt.dequeue().toString();
        String actual = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void deqString() {
        queueString.dequeue();
        String expected = queueString.dequeue();
        String actual = "You killed my father.";
        assertEquals(expected, actual);
    }

    @Test
    public void peek() {
        String expected = queueInt.peek().toString();
        String actual = "1";
        assertEquals(expected, actual);
    }

    @Test
    public void peekNull() {
        Queue<Integer> emptyQueue = new Queue<>();

        String expected = emptyQueue.peek().toString();
        String actual = "null";
        assertTrue(expected == null);
    }

    @Test
    public void emptiedQueue() {
        Queue<Integer> emptyQueue = new Queue<>();

        emptyQueue.enqueue(1);
        emptyQueue.dequeue();
        String expected = emptyQueue.toString();
        String actual = "";
        assertEquals(expected, actual);
    }

}

//Can successfully enqueue into a queue
//Can successfully enqueue multiple values into a queue
//Can successfully dequeue out of a queue the expected value
//Can successfully peek into a queue, seeing the expected value
//Can successfully empty a queue after multiple dequeues
//Can successfully instantiate an empty queue
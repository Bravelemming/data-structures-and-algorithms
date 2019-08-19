package stack_and_queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stackInt = new Stack<>();
    Stack<String> stackString = new Stack<>();

    @Before
    public void setUp() throws Exception {

        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);

        stackString.push("world");
        stackString.push("hello");

    }

    @Test
    public void pushIntTest() {
        String expected = stackInt.toString();
        String actual = "3 2 1 ";
        assertEquals(expected, actual);
    }

    @Test
    public void pushStrTest() {
        String expected = stackString.toString();
        String actual = "hello world ";
        assertEquals(expected, actual);
    }

    @Test
    public void popInt() {
        stackInt.pop();
        String expected = stackInt.pop().toString();
        String actual = "2";
        assertEquals(expected, actual);
    }

    @Test
    public void popString() {
        stackString.pop();
        String expected = stackString.pop();
        String actual = "world";
        assertEquals(expected, actual);
    }

    @Test
    public void peek() {
        String expected = stackInt.peek().toString();
        String actual = "3";
        assertEquals(expected, actual);
    }

    @Test
    public void peekNull() {
        Stack<Integer> emptyStack = new Stack<>();

        String expected = emptyStack.peek().toString();
        String actual = "null";
        assertTrue(expected == null);
    }

    @Test
    public void emptiedStack() {
        Stack<Integer> emptyStack = new Stack<>();

        emptyStack.push(1);
        emptyStack.pop();
        String expected = emptyStack.toString();
        String actual = "";
        assertEquals(expected, actual);
    }

}

//Can successfully push onto a stack
//Can successfully push multiple values onto a stack
//Can successfully pop off the stack
//Can successfully empty a stack after multiple pops
//Can successfully peek the next item on the stack
//Can successfully instantiate an empty stack

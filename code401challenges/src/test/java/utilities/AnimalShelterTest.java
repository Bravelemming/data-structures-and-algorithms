package utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter shelter = new AnimalShelter();
    String cat = "cat";
    String dog = "dog";

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void enqueueDog() {
        shelter.enqueue(dog);
        shelter.enqueue(dog);
        shelter.enqueue(dog);

        shelter.enqueue(cat);
        shelter.enqueue(cat);
        shelter.enqueue(cat);

        String expected = shelter.dequeue(dog);
        String actual = "dog";

        assertEquals(expected, actual);
    }

    @Test
    public void enqueueCat() {
        shelter.enqueue(dog);
        shelter.enqueue(dog);
        shelter.enqueue(dog);

        shelter.enqueue(cat);
        shelter.enqueue(cat);
        shelter.enqueue(cat);

        String expected = shelter.dequeue(cat);
        String actual = "cat";

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueDog() {
        shelter.enqueue(dog);
        shelter.enqueue(dog);

        shelter.enqueue(cat);
        shelter.enqueue(cat);

        String expected = shelter.dequeue(cat);
        String actual = "cat";

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueCat() {
        shelter.enqueue(dog);
        shelter.enqueue(dog);

        shelter.enqueue(cat);
        shelter.enqueue(cat);

        String expected = shelter.dequeue(cat);
        String actual = "cat";

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueNULLCat() {

        String expected = shelter.dequeue(cat);
        String actual = "no more cats!";

        assertEquals(expected, actual);
    }

    @Test
    public void dequeueNULLDog() {

        String expected = shelter.dequeue(dog);
        String actual = "no more dogs!";

        assertEquals(expected, actual);
    }

    @Test
    public void NullPreference() {

        shelter.enqueue(dog);

        shelter.enqueue(cat);

        String expected = shelter.dequeue("moose");
        String actual = "sorry, that's not an allowed preference.";

        assertEquals(expected, actual);
    }

}
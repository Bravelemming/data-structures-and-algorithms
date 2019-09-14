package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable ht = new Hashtable(6);

    @Before
    public void setUp() throws Exception {
        ht.set("John", "Husband");
        ht.set("Cathy", "Boss");
        ht.set("Amanda", "The Real Boss");
        ht.set("Allie", "Kid");
        ht.set("Zach", "Kid");
        ht.set("Rosie", "Dog");
        ht.set("Justin", "Student");
        ht.set("Demi", "Dog");
        ht.set("Ovi", "Student");
        ht.set("Ben", "Student");
        ht.set("Khalil", "Student");
        ht.set("Michael", "Student");
        ht.set("Timea", "Student");
        ht.set("Jason", "Student");
    }


    @Test
    public void setAndGet() {
        ht.set("ThisLove", "Alien");
        String actual = ht.get("ThisLove");
        String expected = "Alien";
        assertEquals( actual, expected );
    }

    @Test
    public void getThroughCollision() {
        String actual = ht.get("John");
        String expected = "Husband";
        assertEquals( actual, expected );
    }

    @Test
    public void has() {
        boolean expected = ht.has("Demi");
        assertTrue( expected );
    }

    @Test
    public void hasNot() {
        boolean expected = ht.has("MEPHESTII GUARDIAN OF SOCKS AND DARKNESS");
        assertFalse( expected );
    }

    @Test
    public void GetNull() {
        String expected = ht.get("THE TERRIBLE SOUND OF HOOBASTANK SNORKLING IN JELLO");
        assertNull( expected );
    }
}
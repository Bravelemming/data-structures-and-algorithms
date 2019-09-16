package repeated_word;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void repeatedWordsTestOne() {
        String alice = "Poor Alice!  It was as much as she could do, lying down on one\n" +
                "side, to look through into the garden with one eye; but to get\n" +
                "through was more hopeless than ever:  she sat down and began to\n" +
                "cry again.";

        RepeatedWord r = new RepeatedWord(alice);

        String actual = r.check();

        String expected = "as";

        assertEquals(expected, actual);

    }

    @Test
    public void repeatedWordsTestTwo() {
        String animals = "They were indeed a queer-looking party that assembled on the\n" +
                "bank--the birds with draggled feathers, the animals with their\n" +
                "fur clinging close to them, and all dripping wet, cross, and\n" +
                "uncomfortable.";

        RepeatedWord r = new RepeatedWord(animals);

        String actual = r.check();

        String expected = "the";

        assertEquals(expected, actual);
    }

    @Test
    public void repeatedWordsTestThree() {
        String dry = "The first question of course was, how to get dry again:  they\n" +
                "had a consultation about this, and after a few minutes it seemed\n" +
                "quite natural to Alice to find herself talking familiarly with\n" +
                "them, as if she had known them all her life.  Indeed, she had\n" +
                "quite a long argument with the Lory, who at last turned sulky,\n" +
                "and would only say, `I am older than you, and must know better';\n" +
                "and this Alice would not allow without knowing how old it was,\n" +
                "and, as the Lory positively refused to tell its age, there was no\n" +
                "more to be said.";

        RepeatedWord r = new RepeatedWord(dry);

        String actual = r.check();

        String expected = "a";

        assertEquals(expected, actual);

    }

    @Test
    public void repeatedWordsTestFail() {
        String dry = "After me.";

        RepeatedWord r = new RepeatedWord(dry);

        String actual = r.check();

        String expected = "And so it was that there were no repeated words.  Crabapple.";


        assertEquals(expected, actual);

    }

}
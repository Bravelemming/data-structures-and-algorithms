package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    MultiBracketValidation m = new MultiBracketValidation();

    String testString1 = "{}";
    String testString2 = "{}(){}";
    String testString3 = "()[[Extra Characters]]";
    String testString4 = "{}{Code}[Fellows](())";
    String testString5 = "[({}]";
    String testString6 = "(](";


    @Test
    public void multi_bracket_validation1() {
        boolean actual = m.multi_bracket_validation(testString1);
        assertEquals(true, actual);
    }
    @Test
    public void multi_bracket_validation2() {
        boolean actual = m.multi_bracket_validation(testString2);
        assertEquals(true, actual);
    }    @Test
    public void multi_bracket_validation3() {
        boolean actual = m.multi_bracket_validation(testString3);
        assertEquals(true, actual);
    }    @Test
    public void multi_bracket_validation4() {
        boolean actual = m.multi_bracket_validation(testString4);
        assertEquals(true, actual);
    }    @Test
    public void multi_bracket_validation5() {
        boolean actual = m.multi_bracket_validation(testString5);
        assertEquals(false, actual);
    }
    @Test
    public void multi_bracket_validation6() {
        boolean actual = m.multi_bracket_validation(testString6);
        assertEquals(false, actual);
    }
}
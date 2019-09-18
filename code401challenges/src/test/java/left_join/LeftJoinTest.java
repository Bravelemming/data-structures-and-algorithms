package left_join;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest {

    HashMap<String, String> left = new HashMap<>();
    HashMap<String, String> right= new HashMap<>();

    @Before
    public void setUp() throws Exception {
        left.put("fond", "enamored");
        left.put("wrath", "anger");
        left.put("diligent", "employed");
        left.put("fond", "enamored");

        right.put("fond", "averse");
        right.put("wrath", "delight");
        right.put("diligent", "idle");
        right.put("guide", "follow");

    }

    @Test
    public void leftJoinFromTwoHashmaps() {
        LeftJoin join = new LeftJoin(left, right);
        ArrayList<List<String>> output = join.leftJoinFromTwoHashmaps();
        StringBuilder expected = new StringBuilder();
        for(List<String> row : output){
            expected.append(row.toString());
        }
        String actual = "[diligent, employed, idle][wrath, anger, delight][fond, enamored, averse]";
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void leftJoinFromTwoHashmapsNull() {
        HashMap<String, String> leftnull = new HashMap<>();
        HashMap<String, String> rightnull= new HashMap<>();

        LeftJoin join = new LeftJoin(leftnull, rightnull);
        ArrayList<List<String>> output = join.leftJoinFromTwoHashmaps();
        StringBuilder expected = new StringBuilder();
        for(List<String> row : output){
            expected.append(row.toString());
        }
        String actual = "";
        assertEquals(expected.toString(), actual);
    }
}
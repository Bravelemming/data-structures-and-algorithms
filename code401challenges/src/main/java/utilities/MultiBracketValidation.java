package utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public boolean multi_bracket_validation(String str){

        //vars
        char flip;
        char popped;
        Stack<Character> stack = new Stack<Character>();

        for (char c: str.toCharArray()){
            //push stack
            if (c == '(' || c == '{' || c == '[') stack.push(c);

            //pop stack and check
            if (c == ')'){
                flip = '(';
                //if no matches, false.
                if (stack.peek() == null) return false;
                popped = stack.pop();
                //unless it matches exactly, false.
                if (popped != flip) return false;
            }
            if (c == '}'){
                flip = '{';
                if (stack.peek() == null) return false;
                popped = stack.pop();
                if (popped != flip) return false;
            }
            if (c == ']'){
                flip = '[';
                if (stack.peek() == null) return false;
                popped = stack.pop();
                if (popped != flip) return false;
            }
        }

        //lastly, check if any unmatched brackets remain
        if (stack.size() > 1) return false;
        // everything matches
        return true;
    }
}

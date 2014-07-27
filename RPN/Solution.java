import java.util.*;

public class Solution {
    Stack<String> stack = new Stack<String>();
    public int evalRPN(String[] tokens) {
        int op1 = 0;
        int op2 = 0;
        for(String token: tokens) {
            if(token.equals("+")) {
                op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(op1+op2));
            } else if(token.equals("-")) {
                op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(op2-op1));
            } else if(token.equals("*")) {
                op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(op1*op2));
            } else if(token.equals("/")) {
                op1 = Integer.parseInt(stack.pop());
                op2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(op2/op1));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

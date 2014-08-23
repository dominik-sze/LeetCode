public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c;
        char t;
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } 
                t = stack.pop();
                if(t=='(' && c!=')') return false;
                if(t=='{' && c!='}') return false;
                if(t=='[' && c!=']') return false;
            }
        }
        return stack.isEmpty();
    }
}

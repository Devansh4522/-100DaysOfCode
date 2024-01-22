import java.util.Stack;

public class str_validParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char popped = st.pop();
                if (s.charAt(i) == ')') {
                    if (popped != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (popped != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (popped != '[') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}

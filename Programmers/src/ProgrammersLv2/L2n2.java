package ProgrammersLv2;

import java.util.Stack;

class L2n2 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            
            if (stack.peek() == '(' && c == ')') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
      
        return stack.isEmpty();
    }
}

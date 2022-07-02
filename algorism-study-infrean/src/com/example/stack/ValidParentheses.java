package src.com.example.stack;

import java.util.Stack;

/*
* 유효한 괄호 ( Valid Parentheses)
* */
public class ValidParentheses {

    public static boolean solve(String s){
        // 1
        Stack<Character> stack = new Stack<>();

        // 2
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();
    }


    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(solve(str));
    }


}

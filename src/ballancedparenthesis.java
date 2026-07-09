/*
read expression
iterate over expression
push opening brackets
when closing brackets


Pseudocode:-
isblancedparenthesis(expression):
create an empty stack
for every character ch:
if ch is opening bracket(if ch = "(" || ch == "{")
push ch
else if ch is closing bracket  
if stack empty
return false 
top =pop()
if pair mismatch
return false 
if stack is empty :
return true
else return false 
 */
import java.util.*;

public class ballancedparenthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";

        if (isBalanced(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}

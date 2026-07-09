import java.util.*;

public class stack1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack  = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                stack.push(ch);
            } else{
                while(!stack.isEmpty()){
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}

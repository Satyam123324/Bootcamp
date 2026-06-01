import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder ans = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
                ans.append(ch);
            }
        }

        System.out.println(ans);
    }
}
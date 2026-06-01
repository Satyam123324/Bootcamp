import java.util.*;

public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        char d = sc.next().charAt(0);

        int len = s.length();
        n = n % len;

        String rotated;

        if (d == 'L' || d == 'l') {
            rotated = s.substring(n) + s.substring(0, n);
        } else {
            rotated = s.substring(len - n) + s.substring(0, len - n);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : rotated.toCharArray()) {
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }

        System.out.println(result);
    }
}
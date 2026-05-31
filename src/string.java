import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();
        String id = sc.nextLine();
        
        fullName = fullName.trim().toLowerCase();

        String[] parts = fullName.split("\\s+");

        String firstName = parts[0];
        String lastName = parts[parts.length - 1];

        String username = firstName + "_" + lastName + id;

        System.out.println(username);

        sc.close();
    }
}
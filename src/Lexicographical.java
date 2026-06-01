import java.util.*;

public class Lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);   // Start with smallest permutation

        while (true) {
            System.out.println(new String(arr));

            int i = arr.length - 2;

            while (i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }

            if (i < 0) {
                break;
            }

            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Reverse remaining part
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
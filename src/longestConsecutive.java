public class longestConsecutive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,5};

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                currLen++;
            else
                currLen = 1;

            maxLen = Math.max(maxLen, currLen);
        }

        System.out.println(maxLen);
    }
}
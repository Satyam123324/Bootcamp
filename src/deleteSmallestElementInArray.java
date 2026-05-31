public class deleteSmallestElementInArray {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};
        int n = arr.length;

        // Find index of smallest element
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Shift elements left
        for (int i = minIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print array after deletion
        System.out.print("Array after deleting smallest element: ");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
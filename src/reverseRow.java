public class reverseRow {

    public static void main(String[] args) {

        int[][] matrix = {
            {1,3,4},
            {2,4,7},
            {8,9,5}
        };
        for(int i = 0; i < matrix.length; i++) {

            int start = 0;
            int end = matrix[i].length - 1;

            while(start < end) {

                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
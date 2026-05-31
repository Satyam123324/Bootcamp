public class sumOfBoundaryElementInArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of boundary elements: " + sum);
    }
}

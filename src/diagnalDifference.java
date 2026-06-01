public class diagnalDifference {
    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {9,8,9}
        };

        int primary = 0;
        int secondary = 0;
        int n = mat.length;

        for(int i=0;i<n;i++){
            primary += mat[i][i];
            secondary += mat[i][n-i-1];
        }

        System.out.println(Math.abs(primary-secondary));
    }
}
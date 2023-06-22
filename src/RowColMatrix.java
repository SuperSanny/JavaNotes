import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {3,4,5,6},
                {5,7,8,10},
                {8,14,25,70}
        };
        System.out.println(Arrays.toString(search(arr, 11)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while (row < matrix.length && col >=0){
            if(matrix[row][col]==target)
                return new int[]{row, col};
            if(matrix[row][col] < target)
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }
}

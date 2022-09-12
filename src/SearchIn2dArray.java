import java.util.*;
public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 9, 12},
                {78, 85, 40, 13, 3},
                {7, 65, 14, 9, 25, 45},
                {1, 20}
        };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

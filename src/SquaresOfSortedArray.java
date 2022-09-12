import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr= {-4, -1, 0, 3, 10};
        int[] ans = sortedSquares(arr);
        for (int an : ans) {
            System.out.print(an + ",");
        }
    }
    static int[] sortedSquares(int[] nums){
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i] * nums[i];
        }
        Arrays.sort(num);
        return num;
    }
}

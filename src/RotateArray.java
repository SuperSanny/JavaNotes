//https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arrs, k);

    }
    static void rotate(int[] nums, int k) {
//        if (k==0) return;
//        if (nums == null || nums.length == 0) return;

        int[] num = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int temp = (i + k) % nums.length;
            num[temp] = nums[i];
        }

        //assign back to original array
//        for (int i=0; i<nums.length; i++) {
//            nums[i] = num[i];
//        }
        System.out.print("[");
        for (int an : num){
            System.out.print(an + ",");
        }
        System.out.print("\b"+"]");
    }
}

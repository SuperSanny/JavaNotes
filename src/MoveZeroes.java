//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arrs = {0, 1, 0, 3, 12};
        moveZeroes(arrs);
    }
    static void moveZeroes(int[] nums){
//        int[] num = new int[nums.length];
//        int len = nums.length - 1;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                num[len] = nums[i];
//                count++;
//                len--;
//            }
//            else{
//                num[i-count] = nums[i];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = num[i];
//        }
//        System.out.print("[");
//        for (int j : nums) {
//            System.out.print(j + ",");
//        }
//        System.out.print("\b"+"]");

        int count=0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

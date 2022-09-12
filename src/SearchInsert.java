//https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=algorithm-i
public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }
    static int searchInsert(int[] nums, int target){
        for (int start = 0; start < nums.length; start++) {
            if (target == nums[start] || target < nums[start])
                return start;
        }
        return nums.length;
    }
}

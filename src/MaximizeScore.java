import java.util.Arrays;

public class MaximizeScore {

    public static int backtrack(int[] nums, int mask, int pairsPicked, int[] memo){
        if(2 * pairsPicked == nums.length){
            return 0;
        }
        if(memo[mask] != -1){
            return memo[mask];
        }
        int maxScore = 0;
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(((mask >> i) & 1) == 1 || ((mask >> j) & 1) == 1)
                    continue;

                int newMask = mask | (1 << i) | (1 << j);
                int currScore = (pairsPicked + 1) * gcd(nums[i], nums[j]);
                int remainingScore = backtrack(nums, newMask, pairsPicked + 1, memo);
                maxScore = Math.max(maxScore, currScore + remainingScore);
            }
        }
        memo[mask] = maxScore;
        return maxScore;
    }
    public static int maxScore(int[] nums){
        int memeSize = 1 << nums.length;
        int[] memo = new int[memeSize];
        Arrays.fill(memo, -1);
        return backtrack(nums, 0, 0, memo);
    }
    static int gcd(int x, int y){
        return y == 0 ? x : gcd(y, x%y);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(maxScore(arr));
    }
}

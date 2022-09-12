public class TwoSum {
    public static void main(String[] args) {
        int[] arrs = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twosum(arrs, target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
    static int[] twosum(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            if (numbers[start]+numbers[end] > target) {
                end -=1;
            } else if (numbers[start]+numbers[end] < target) {
                start +=1;
            }
            else {
                return new int[] {start+1, end+1};
            }
        }
        return new int[] {start+1, end+1};
    }
}


public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arrs = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println("Maximum Wealth : "+ maximumWealth(arrs));
    }
    static int maximumWealth(int[][] arrs){
        int ans = Integer.MIN_VALUE;
        for(int[] row : arrs){
            int sum = 0;
            for (int col : row){
                sum += col;
            }
            if(sum > ans)
                ans = sum;
        }
        return ans;
    }
}

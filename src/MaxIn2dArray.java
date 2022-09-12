public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 9, 12},
                {78, 85, 40, 13, 3},
                {7, 65, 14, 9, 25, 45},
                {1, 20}
        };
        System.out.print(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for (int elements : row){
                if(elements > max)
                    max = elements;
            }
        }
        return max;
    }
}

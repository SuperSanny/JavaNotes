import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array row and columns : ");
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int row = -1,col = -1;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j] == 0) {
                    row = i;
                    col = j;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (row == i || col == j) {
                   arr[i][j] = 0;
                }
            }
            System.out.print("\n");
        }
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}

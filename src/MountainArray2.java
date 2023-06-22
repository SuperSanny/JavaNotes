import java.util.*;
public class MountainArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,3,2,1,0};
        boolean res = validMountainArray(arr);
        System.out.println(res);
    }

    private static boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        // walk up
        while (i+1 < N && arr[i] < arr[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && arr[i] > arr[i+1])
            i++;

        return i == N-1;
    }
}

import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        int start = 0, end = arr.length-1;
        while (start<=end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

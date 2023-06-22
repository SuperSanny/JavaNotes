import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    public static int[] cyclicSort(int[] arr){

        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

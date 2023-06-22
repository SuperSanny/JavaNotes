import java.util.Arrays;

public class SelectionSort {

//    Using last index
    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[last])
                max = i;
        }
        return max;
    }

//    Using first index
    static int[] selectionSortByMin(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1;
            int minIndex = getMinIndex(arr, i, last);
            swap(arr, minIndex, i);
        }
        return arr;
    }
    static int getMinIndex(int[] arr, int start, int end){
        int min = start;
        for (int i = start ; i < end; i++) {
            if(arr[min]> arr[end])
                min = i;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,0,0};
        System.out.println(Arrays.toString(selectionSort(arr)));
        System.out.print(Arrays.toString(selectionSortByMin(arr)));
    }
}

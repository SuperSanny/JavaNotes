//https://leetcode.com/problems/peak-index-in-a-mountain-array/
import java.util.*;
public class MountainArray1 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,1};
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
    }
}

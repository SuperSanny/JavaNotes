import java.util.*;
public class CeilTheFloor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8 ,13, 21};
        int target = 1;
        Pair ans = new Solve().getFloorAndCeil(arr, target);
        System.out.println("Floor: "+ans.floor+" and Ceil: "+ ans.ceil);
    }
}
class Pair{
    int floor, ceil;
    Pair(){
        this.floor = 0;
        this.ceil = 0;
    }
    Pair(int floor, int ceil){
        this.floor = floor;
        this.ceil = ceil;
    }
}

class Solve{
    Pair getFloorAndCeil(int[] arr, int target){


        Pair pair = new Pair(-1, -1);
        int start = 0, end = arr.length-1;
        int floor = pair.floor, ceil = pair.ceil;
        if(target > arr[arr.length-1]){
            ceil = -1;
        }
        else if(target < arr[start]){
            floor = -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
            else {
                floor = arr[mid-1];
                ceil = arr[mid+1];
            }
        }
        pair.ceil = ceil;
        pair.floor = floor;
        return pair;
    }
}
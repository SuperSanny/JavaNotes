public class Ceil {

    static int ceiling(int[] arr, int target){
        int start = 0, end = arr.length-1;
        if(target >= arr[arr.length-1]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8 ,13, 21};
        int target = 7;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}

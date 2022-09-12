public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 3, 5, 9, 12, 20, 24};
        int target1 = 12;
        int[] arr2 = {24, 20, 12, 9, 5, 3, 0, -1};
        int target2 = 5;
        System.out.println("Asc Order : " + orderAgnosticBS(arr1, target1));
        System.out.println("Desc Order : " + orderAgnosticBS(arr2, target2));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if (isAsc){
                if(arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else {
                if(arr[mid] > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}

public class SwapKthElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
//        int[] arr = {5, 3, 6, 1, 2};
//        int target = 2;
//        Swap(arr, target);
        int temp1 = arr[arr.length-target];
        int temp2 = arr[target-1];
        arr[target-1] = temp1;
        arr[arr.length-target] = temp2;
        for (int a : arr){
            System.out.print(a+" ");
        }
    }
//    static void Swap(int[] arr, int target){
//        int l = arr.length-target;
//        int temp1=0;
//        int temp2=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(i+1 == target){
//                temp1 += arr[i];
//                arr[i] = arr[l];
//
//            }
//            else if(i+1 == l+1){
//                arr[i] = temp1;
//            }
//        }
//        for (int a : arr){
//            System.out.print(a+" ");
//        }
//    }
}

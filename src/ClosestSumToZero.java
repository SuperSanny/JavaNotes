import java.util.Arrays;

public class ClosestSumToZero {
    public static int[] closestSumToZero(int[] arr) {
        int[] positiveNumbers = Arrays.stream(arr)
                .filter(x -> x > 0)
                .toArray();
        Arrays.sort(positiveNumbers);

        int left = 0;
        int right = positiveNumbers.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        while (left < right) {
            int currSum = positiveNumbers[left] + positiveNumbers[right];

            if (Math.abs(currSum) < Math.abs(closestSum)) {
                closestSum = currSum;
                closestPair[0] = positiveNumbers[left];
                closestPair[1] = positiveNumbers[right];
            }

            if (currSum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return closestPair;
    }
    public static void main(String[] args) {
        int[] arr = {15, 6, 8, 9, -5, 20, 4, 5, -1, 2};
        int[] closestPair = closestSumToZero(arr);
        System.out.println("Closest Pair: " + closestPair[1] + "," + closestPair[0]);
    }
}

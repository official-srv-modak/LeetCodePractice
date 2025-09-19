public class Kadane {


    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum is: " + maxSubArraySum(arr));
    }

    private static int maxSubArraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxOfAll = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxOfAll = Math.max(maxOfAll, maxEndingHere);
        }
        return maxOfAll;
    }
}
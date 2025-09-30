public class KadanesMultiplication {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];

        for(int i = 1; i < n; i++)
        {
            if(arr[i] < 0)
            {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(arr[i], arr[i] * maxEndingHere);
            minEndingHere = Math.min(arr[i], arr[i] * minEndingHere);

            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }
}

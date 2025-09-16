public class BinarySearch {

    public static int binarySearch(int[] arr, int val)
    {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = (low + high) % 2 == 0? (low + high)/2 : ((low + high)/2) + 1;
            if(arr[mid] == val)
                return mid;

            if(val < arr[mid])
                high = mid - 1;
            if(val >= arr[mid])
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,
                2,
                5,
                6,
                7,
                9,
                15};

        int i = binarySearch(arr, 7);
        System.out.println(i);
    }
}

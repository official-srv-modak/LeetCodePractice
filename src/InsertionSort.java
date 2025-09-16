public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            for(int j = i - 1; j >= 0 && arr[j] > key; j--)
            {
                arr[j + 1] = arr[j];
            }
            arr[i] = key;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {9,1,15,6,2,5,7};

        insertionSort(arr);
        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}

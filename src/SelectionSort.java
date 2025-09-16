public class SelectionSort {

    static int [] selectionSort(int[] arr)
    {
        for(int i = 0; i + 1 < arr.length; i++)
        {

            int minIndex = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int arr[] = {9,1,15,6,2,5,7};

        selectionSort(arr);

        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}

import java.util.Arrays;

public class MissingNum {
    static int missingNum(int arr[]) {
        // code here
        if(arr.length == 0)
            return 1;

        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        for(int i = 0, j = 1; i < arr.length && j <= max; i++, j++)
        {
            if(j != arr[i])
                return j;
        }
        return arr[arr.length - 1] + 1;
    }

    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{2}));
    }
}

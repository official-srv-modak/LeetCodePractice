import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervals[0];
        List<int[]> mergedList = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++)
        {
            int[] innerArray = intervals[i];

            if(innerArray[0] <= prev[1])
            {
                int[] out = new int[2];
                out[0] = Math.min(prev[0], innerArray[0]);
                out[1] = Math.max(prev[1], innerArray[1]);
                mergedList.add(out);
            }
            else{
                if(mergedList.size() != 0)
                {
                    mergedList.add(innerArray);
                }
                else
                {
                    if(prev[0] != innerArray[0])
                        mergedList.add(prev);
                    mergedList.add(innerArray);
                }
                prev = innerArray;
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void display(int[][] intervals)
    {
        for(int i = 0; i < intervals.length; i++)
        {
            int[] inner = intervals[i];
            for(int j = 0; j < inner.length; j++)
            {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        int[][] intervals3 = {{1,4},{5,6}};
//        int[][] intervals3 = {{1,4},{2,3}};
        int[][] intervals3 = {{1,4},{0,2},{3,5}};
//        int[][] intervals3 = {{1,3},{2,6},{8,10},{15,18}};
        display(merge(intervals3));

    }
}

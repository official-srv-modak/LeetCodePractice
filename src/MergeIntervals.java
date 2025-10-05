import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int containInList(List<int[]> mergedList, int[] val){
        for(int i = mergedList.size() - 1; i >=0; i--)
        {
            int [] v = mergedList.get(i);
            if(v[0] == val[0] && v[1] == val[1])
                return i;
        }
        return -1;
    }

    public static int[][] merge(int[][] intervals) {

        if(intervals.length == 1)
            return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedList = new ArrayList<>();

        int[] prev = intervals[0];

        for(int i = 0; i < intervals.length; i++)
        {
            int[] curr = intervals[i];
            if(prev[1]>=curr[0])
            {
                mergedList.remove(prev);
                int[] out = new int[2];
                out[0] = Math.min(prev[0], curr[0]);
                out[1] = Math.max(prev[1], curr[1]);
                mergedList.add(out);
                prev = out;
            }
            else{
                mergedList.add(curr);
                prev = curr;
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
//        int[][] intervals3 = {{1,4},{0,2},{3,5}};
        int[][] intervals3 = {{1,3},{2,6},{8,10},{15,18}};
//        int[][] intervals3 = {{1,4},{4,5}};
        display(merge(intervals3));

    }
}

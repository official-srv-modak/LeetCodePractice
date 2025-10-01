import java.util.Arrays;

public class FractionalGreedyKnapsack {

    public static int insertInKnapsack(KnapsackItems[] items, int capacityWeight)
    {
        Arrays.sort(items, (a,b) ->{
            return Double.compare((double) b.value / b.weight, (double) a.value / a.weight);
        });

        int filledValue = 0;
        int filledWeight = 0;
        for(KnapsackItems item : items)
        {
            if(filledWeight + item.weight < capacityWeight)
            {
                filledWeight += item.weight;
                filledValue += item.value;
            }
            else{
                int remainingWeight = capacityWeight - filledWeight;
                double fraction = (double) remainingWeight / item.weight;
                filledValue += fraction * item.value;
                break;
            }
        }
        return filledValue;
    }

    public static void display(KnapsackItems[] arr)
    {
        for(KnapsackItems val: arr)
            System.out.println(val);
    }

    public static void main(String[] args) {

        KnapsackItems i1 = new KnapsackItems(60, 10);
        KnapsackItems i2 = new KnapsackItems(100, 20);
        KnapsackItems i3 = new KnapsackItems(120, 30);

        KnapsackItems[] arr = {i1,i2,i3};
        System.out.println(insertInKnapsack(arr, 50));
        display(arr);
    }
}

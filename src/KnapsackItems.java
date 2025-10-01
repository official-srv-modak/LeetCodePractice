public class KnapsackItems {
    int weight, value;

    public KnapsackItems(int value, int weight) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KnapsackItems{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}

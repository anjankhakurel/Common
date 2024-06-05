package arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] array = {-22, -44, -11, -77, -99, 0, -12};
        FindMax anjana = new FindMax();
        int max = anjana.findMax(array);
        System.out.println("Maximim element of an array:" + max);
    }
    public int findMax(int[] thulo) {
        int max = 0;
        for (int i = 1; i < thulo.length; i++) {
            if (thulo[i] > thulo [max]) {
                max = i;

            }
        }
        return max;
    }
}

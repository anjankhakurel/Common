package arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] array = {-22, -44, -11, -77, -99, 0, -12};
        FindMax anjana = new FindMax();
        int max = anjana.findMax(array);
        System.out.println("Maximim element of an array:" + max);
    }
    public int findMax(int[] thulo) {
        int max = thulo[0];
        for (int i = 1; i < thulo.length; i++) {
            if (thulo[i] > max) {
                max = thulo[i];

            }
        }
        return max;
    }
}

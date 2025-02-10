import java.util.Arrays;

public class Prefix {  
    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};  
        int[] prefixSum = computePrefixSum(sales);

        System.out.println("Sales: " + Arrays.toString(sales));
        System.out.println("PrefixSum: " + Arrays.toString(prefixSum));
    }

    // Method to compute the prefix sum
    public static int[] computePrefixSum(int[] sales) {
        int n = sales.length;
        int[] prefixSum = new int[n];

        // Initialize the first element
        prefixSum[0] = sales[0];

        // Calculate prefix sums for each subsequent hour
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }

        return prefixSum;
    }
}
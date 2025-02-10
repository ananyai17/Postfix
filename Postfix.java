import java.util.Arrays;

public class Postfix {  
    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};  
        int[] postfixSum = computePostfixSum(fuel);

        System.out.println("Fuel Consumption: " + Arrays.toString(fuel));
        System.out.println("PostfixSum: " + Arrays.toString(postfixSum));
    }

    public static int[] computePostfixSum(int[] fuel) {
        int m = fuel.length;
        int[] postfixSum = new int[m];

        postfixSum[m - 1] = fuel[m - 1];


        for (int i = m - 2; i >= 0; i--) {
            postfixSum[i] = fuel[i] + postfixSum[i + 1];
        }

        return postfixSum;
    }
}
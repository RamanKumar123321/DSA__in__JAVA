import java.util.*;

public class maxSubarrayXOR {

    public static int maxSubarrayXOR(int[] arr, int k) {

        int xor = 0;

        // XOR of first k elements
        for (int i = 0; i < k; i++) {
            xor = xor ^ arr[i];
        }

        int max = xor;

        // Sliding window
        for (int i = k; i < arr.length; i++) {

            // Remove old element
            xor = xor ^ arr[i - k];

            // Add new element
            xor = xor ^ arr[i];

            max = Math.max(max, xor);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Enter k
        int k = sc.nextInt();

        System.out.println(maxSubarrayXOR(arr, k));

        sc.close();
    }
}

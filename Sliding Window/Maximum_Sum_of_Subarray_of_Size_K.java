import java.util.*;

public class Maximum_Sum_of_Subarray_of_Size_K {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        // Remaining windows
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum sum = " + max);

        sc.close();
    }
}
import java.util.Scanner;
import java.util.*;
public class Mountain_Of_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;

        // Increasing
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak first or last
        if (i == 0 || i == n - 1) {
            System.out.println(false);
            return;
        }

        // Decreasing
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        System.out.println(i == n - 1);
    }
}

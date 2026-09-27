import java.util.Scanner;
import java.util.*;
public class Array_Prototype_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[n - 1]);
        }
    }
}

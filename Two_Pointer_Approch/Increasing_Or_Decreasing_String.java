import java.util.*;

public class Increasing_Or_Decreasing_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        boolean inc = true, dec = true;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1])
                dec = false;
            if (nums[i] < nums[i - 1])
                inc = false;
        }

        System.out.println(inc || dec);
    }
}

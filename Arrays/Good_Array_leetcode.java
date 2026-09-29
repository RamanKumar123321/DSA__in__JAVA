import java.util.*;

public class Good_Array_leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];

        for (int x : nums) {
            freq[x]++;
        }

        boolean good = true;

        if (nums.length != 2 * max - 1) {
            good = false;
        }

        for (int i = 1; i < max; i++) {
            if (freq[i] != 2) {
                good = false;
                break;
            }
        }

        if (freq[max] != 1) {
            good = false;
        }

        System.out.println(good);
    }
}
import java.util.*;
public class Min_Sub_Array_Len {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter target: ");
            int target = sc.nextInt();

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int left = 0;
            int sum = 0;
            int ans = Integer.MAX_VALUE;

            for (int right = 0; right < n; right++) {
                sum += nums[right];

                while (sum >= target) {
                    ans = Math.min(ans, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
            }

            System.out.println("Minimum length = " +
                    (ans == Integer.MAX_VALUE ? 0 : ans));
        }
    }


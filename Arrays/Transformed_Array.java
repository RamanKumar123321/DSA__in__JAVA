
import java.util.*;

public class Transformed_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int index = (i + nums[i]) % n;

            if (index < 0)
                index += n;

            ans[i] = nums[index];
        }

        System.out.println(Arrays.toString(ans));
    }
}

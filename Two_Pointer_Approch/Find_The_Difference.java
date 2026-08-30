import java.util.*;
public class Find_The_Difference {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String nums1 = sc.nextLine();
        String nums2 = sc.nextLine();
        char result = 0;
        for (char c : nums1.toCharArray()) {
            result ^= c;
        }
        for (char c : nums2.toCharArray()) {
            result ^= c;
        }
        System.out.println(result);

    }
}


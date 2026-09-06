import java.util.*;

public class Leetcode_Problem_No_438 {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] count = new int[26];

        // p ke characters ka frequency count
        for (char ch : p.toCharArray()) {
            count[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int required = p.length();

        // Sliding Window
        while (right < s.length()) {

            // Right character ko window me add karo
            char ch = s.charAt(right);

            if (count[ch - 'a'] > 0) {
                required--;
            }

            count[ch - 'a']--;
            right++;

            // Window size p ke size se badi ho
            if (right - left > p.length()) {

                char remove = s.charAt(left);

                if (count[remove - 'a'] >= 0) {
                    required++;
                }

                count[remove - 'a']++;
                left++;
            }

            // Anagram mil gaya
            if (required == 0) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter p: ");
        String p = sc.nextLine();

        List<Integer> result = findAnagrams(s, p);

        System.out.println("Answer: " + result);

        sc.close();
    }
}

import java.util.*;
public class Permutation_n_String_567 {
    public static boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }

            int[] count = new int[26];

            // Count characters in s1
            for (char c : s1.toCharArray()) {
                count[c - 'a']++;
            }

            int windowSize = s1.length();

            for (int i = 0; i < s2.length(); i++) {
                // Add current character
                count[s2.charAt(i) - 'a']--;

                // Remove character outside the window
                if (i >= windowSize) {
                    count[s2.charAt(i - windowSize) - 'a']++;
                }

                // Check if all counts are zero
                if (i >= windowSize - 1 && isZero(count)) {
                    return true;
                }
            }

            return false;
        }

        private static boolean isZero(int[] count) {
            for (int value : count) {
                if (value != 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter s1: ");
            String s1 = sc.nextLine();

            System.out.print("Enter s2: ");
            String s2 = sc.nextLine();

            boolean result = checkInclusion(s1, s2);

            System.out.println("Output: " + result);

            sc.close();
        }
    }

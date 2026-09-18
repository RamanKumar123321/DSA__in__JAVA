import java.util.*;
public class Divide_a_String_into_groups_of_Size_K {
        public static String[] divideString(String s, int k, char fill) {
            // Step 1: Pad the string if the last group is incomplete
            int rem = s.length() % k;
            if (rem != 0) {
                s += String.valueOf(fill).repeat(k - rem);
            }

            // Step 2: Split the string into equal chunks of size k
            String[] result = new String[s.length() / k];
            for (int i = 0; i < result.length; i++) {
                result[i] = s.substring(i * k, (i + 1) * k);
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Take input string 's'
            System.out.print("Enter string (s): ");
            String s = scanner.nextLine().trim();

            // 2. Take integer group size 'k'
            System.out.print("Enter group size (k): ");
            int k = scanner.nextInt();

            // 3. Take character 'fill'
            System.out.print("Enter fill character: ");
            char fill = scanner.next().charAt(0);

            // Call the solution method
            String[] result = divideString(s, k, fill);

            // Print the output array
            System.out.println("\nDivided Groups: " + Arrays.toString(result));

            scanner.close();
        }
    }
import java.util.*;
public class String_Frequency_Of_String {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
        
    }
}

import java.util.*;
public class String_Substring_of_given_Sentence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        System.out.println("From");
        int first=sc.nextInt();
        System.out.println("To");
        int last=sc.nextInt();
        System.out.println(str.substring(first,last));

    }
}

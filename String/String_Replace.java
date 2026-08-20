import java.util.*;
public class String_Replace {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the Search String");
        String search=sc.nextLine();
        System.out.println("Enter the String to replace");
        String replace=sc.nextLine();
        System.out.println("After searching and replacing we get new String: " +str.replace(search,replace));
    }
}

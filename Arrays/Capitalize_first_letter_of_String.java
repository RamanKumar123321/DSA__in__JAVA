import java.util.*;
public class Capitalize_first_letter_of_String {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s: arr){
            //char ch=(char)(s.charAt(0) -32);
            char ch=Character.toUpperCase(s.charAt(0));
            String s1=s.substring(1);
            sb.append(s);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

import java.util.*;
public class String_Reverse_By_String {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);

        }System.out.println("Reverse of String is: " +new String(reverse));
    }
}

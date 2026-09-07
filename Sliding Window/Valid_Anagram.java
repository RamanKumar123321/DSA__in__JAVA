import java.util.*;
public class Valid_Anagram {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.print("Anagram");
        }else{
            System.out.print("Not Anagram");
        }


    }
}

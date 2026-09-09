import java.util.*;
public class All_Anagrams_in_a_String {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String p=sc.nextLine().toLowerCase();
        for(int i=0;i<=s.length()-p.length();i++){
            String sub=s.substring(i,i+p.length());
            char[] a=sub.toCharArray();
            char[] b=p.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                System.out.println(i);
            }
        }
    }
}

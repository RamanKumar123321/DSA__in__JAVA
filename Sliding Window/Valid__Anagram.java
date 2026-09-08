import java.util.*;
public class Valid__Anagram {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(char ch:s.toCharArray()){
            a1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            a2[ch-'a']++;
        }
        if(Arrays.equals(a1,a2)){
            System.out.print("Anagram");
        }else{
            System.out.print("Not Anagram");
        }
    }
}

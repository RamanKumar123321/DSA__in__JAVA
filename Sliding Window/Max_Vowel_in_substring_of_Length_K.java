import java.util.*;
public class Max_Vowel_in_substring_of_Length_K {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int count =0,max=0;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1)
                count++;
            if(i>=k &&"aeiouAEIOU".indexOf(s.charAt(i-k))!=-1)
                count--;
            if(i>=k-1)
                max=Math.max(max,count);
        }
        System.out.println(max);
    }
}

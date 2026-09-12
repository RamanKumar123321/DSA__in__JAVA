import java.util.*;
public class Permeutation {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean found=false;
        for(int i=0;i<=s1.length()-s2.length();i++){
            String sub=s1.substring(i,i+s2.length());
            char[] a=s2.toCharArray();
            char[] b=sub.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}

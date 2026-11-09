import java.util.*;
public class Counting_number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\n ");
        fun(n,1);


    }
    static void fun(int n,int i){
        if(i>n)return;
        System.out.print(i+" ");
        fun(n,i+1);
    }
}

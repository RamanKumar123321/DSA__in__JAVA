import java.util.*;
public class String_Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Element");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the String");
        String str=sc.nextLine();

        char[] arr=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


            }
        System.out.println("Reverse: " +new String(arr));

        }
}

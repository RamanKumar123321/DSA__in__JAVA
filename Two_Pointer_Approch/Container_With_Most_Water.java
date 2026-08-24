import java.util.*;
public class Container_With_Most_Water {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length -1;
        int max=0;
        while(i<j){
            int min=Math.min(arr[i],arr[j]);
            int len=j-i;
            int vol=min*len;
            max=Math.max(max,vol);
            if(arr[i]<arr[j]){
                i++;}
            else{j--;}
        }
        System.out.println(max);
    }
}

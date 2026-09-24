import java.util.*;

public class Decode_Xor_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = sc.nextInt();

        int[] encoded = new int[n];
        for (int i = 0; i < n; i++) {
            encoded[i] = sc.nextInt();
        }

        int[] arr = new int[n + 1];
        arr[0] = first;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}

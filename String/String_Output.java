import java.util.Arrays;

public class String_Output {
    static void main(String[] args) {
        String name = "abcd";
        String s1 = new String("abcd");
        System.out.println(s1);

        char chrs[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s2 = new String(chrs);
        System.out.println(s2);

        char arr[] = s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(s2.length());
        System.out.println(arr.length);
    }
}

import java.util.*;
public class String_1 {
    static void main(String[] args) {
        String name="abcd";
        String s1=new String("abcd");
        System.out.println(s1);

        char chrs[]={'a','b','c','d','e','f'};
        String s2=new String(chrs);
        System.out.println(s2);

        char arr[]=s1.toCharArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(s2.length());
        System.out.println(arr.length);

        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            System.out.println(ch);
        }

        char ch='a';
        int a=ch-32;
        System.out.println((char)a);

        String s3="abcd";
        String s4="abcd";
        if(s3==s4) System.out.println("Same");
        //CHECK ADDRESS OF STRING
        else System.out.println("Not Same");
        System.out.println(s3.equals(s4));

        String s5="ABcd";
        String s6="abcd";
        System.out.println(s5.equalsIgnoreCase(s6));  //for comparing two string having diffent input of same

        String s7="Hello World";
        String s8="Hello";
        System.out.println(s7.startsWith(s8));
        String s9="World";
        System.out.println(s7.endsWith(s9));
        String s10="ello";
        System.out.println(s7.contains(s10));
        //.indexOf() is used to find first occurance and .lastindexOf() is used to find last index of String.
        // .trim() is used to remove spaces.
        String s11="  Hello  ";
        System.out.println(s11.trim());

        String s12="abcdef";
        String s13=s12.replace('a','z');
        System.out.println(s13);
        // for replacing any element use .replace("ABC","DEF") for String and forcharacter .replace('a', 'b')
        String s14="Abcdef";
        System.out.println(s14.substring(2));
        // for printing some part of String use .substring(x,y).
        // subsequenc is used to pick and drop some part of string but in ascending order of String.
        }

    }

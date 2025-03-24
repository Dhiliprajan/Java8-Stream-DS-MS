package codeexample;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] str = {"pen","code","madam","indeedni"};
        Arrays.stream(str)
        .filter((a -> a.equals(new StringBuilder(a).reverse().toString())))
        .forEach(System.out::println);

        String s1 = "listen";
        String s2 = "silent";

        if(findAnagra(s1,s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    private static boolean findAnagra(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}

package codeexample;

import java.util.Arrays;

public class Anagram {
    // Anagram means a word or phrase formed by rearranging
    // the letters of a different word or phrase,
    // typically using all the original letters exactly once

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (findAnagram(s1,s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }

    private static boolean findAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}

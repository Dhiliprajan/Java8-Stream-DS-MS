package leedcode;

import java.util.HashSet;
import java.util.Set;

public class SubStringMatch {
    private static String findSubStringMatch(String s1, String s2) {
        Set<Character> setS1 = new HashSet<>();
        Set<Character> setS2 = new HashSet<>();
        for(char c: s1.toCharArray()){
            setS1.add(c);
        }
        for(char c: s2.toCharArray()){
            setS2.add(c);
        }
        setS1.retainAll(setS2);  // concat values
        if(!setS1.isEmpty())
            return "Yes";
        return "No";
    }
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Rat";
        String result = findSubStringMatch(s1, s2);
        System.out.println(result);
    }
}

package stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindLongestString {
    public static void main(String[] args) {
        String[] names = {"Pen","Paper","Stone","Adapter"};
        //method 1
        String str = Arrays.stream(names)
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(str);
        //method 2
        String str1 = Arrays.stream(names).reduce((a,b)->a.length() < b.length() ? a:b).get();
        System.out.println(str1);


    }
}

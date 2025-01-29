package stream1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLength {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Orange","Kiwi","Mango");
        fruits.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}

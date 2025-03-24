package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,83,80,65,28,21,34);
        List<Integer> oddList = numbers.stream()
                .filter(e -> e%2!=0)
                .toList();
        List<Integer> evenList = numbers.stream()
                .filter(e -> e%2==0)
                .collect(Collectors.toList());
        System.out.println("Odd List : "+oddList+" Even List : " +evenList);

    }
}

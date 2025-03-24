package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 34, 25, 299, 65, 90, 236, 398, 786, 30);
        List<Integer> startWith2nd3 = numbers.stream()
                .map(e -> e + "")
                .filter(e -> e.startsWith("2") || e.startsWith("3"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(startWith2nd3);

        Long count = numbers.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2")).count();
        System.out.println(count);
    }
}

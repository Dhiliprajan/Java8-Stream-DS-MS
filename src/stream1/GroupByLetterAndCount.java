package stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLetterAndCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice","Bob","Charlie","Annie","Bae");
        Map<Character, Long> count = list.stream()
                .collect(Collectors.groupingBy(e-> e.charAt(0), Collectors.counting()));
        System.out.println(count);
    }
}

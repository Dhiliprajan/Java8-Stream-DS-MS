package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharFromString {
    public static void main(String[] args) {
        String name = "Java is a very popular language";
        List<String> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1 && !e.getKey().equals(" "))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

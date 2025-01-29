package stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachChar {
    public static void main(String[] args) {
        String name = "I want to explore kashmir";
        Map<String, Long> res = Arrays.stream(name.split(""))
                .filter(e-> !e.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(res);
    }
}

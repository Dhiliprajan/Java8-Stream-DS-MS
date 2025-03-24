package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStreamExample {
    public static void main(String[] args) {
        /* find count of each character */
        String input = "ilovejavatechie";
        Map<String, Long> character = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(character);

        /* find duplicate character */
        List<String> duplicates =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() > 1)
                // Unique value .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(duplicates);

        /* find first non-repeating character */

        String firstElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter( s -> s.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstElement);

        /* Sec highest number */
        int[] numbers = {2,48,28,29,9,59};
        Integer secHigh = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secHigh);

        /* find longest string in given array */
        String[] words = {"apple", "orange", "watermelon","kiwi"};
        String ans = Arrays.stream(words)
                .reduce((w1,w2) -> w1.length() > w2.length()?w1:w2)
                .get();
        System.out.println(ans);

        /* starts with */
        int[] arr = {1,5,32,55,78,599};
        List<String> result = Arrays.stream(arr)
                .boxed()
                .map(String::valueOf)
                .filter(e->e.startsWith("5"))
                .toList();
        System.out.println(result);

        IntStream.rangeClosed(1,10)
                .skip(2)
                .limit(7)
                .forEach(System.out::println);
    }
}

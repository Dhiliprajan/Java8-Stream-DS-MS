package stream1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String word = "Java is a programming language, java is a versatile";
        Map<String, Long> wordFreq = Arrays.stream(word.split("\\s+"))
                .collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
        System.out.println(wordFreq);
    }
}

package stream1;

import java.util.List;
import java.util.stream.Collectors;

public class PalindromeWords {
    public static void main(String[] args) {
        List<String> list = List.of("level","pen","madam","deed","house");
        List<String> palindromeWords = list.stream()
                .filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromeWords);
    }
}

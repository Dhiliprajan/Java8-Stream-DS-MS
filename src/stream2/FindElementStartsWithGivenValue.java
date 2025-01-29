package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementStartsWithGivenValue {
    public static void main(String[] args) {
        int[] numbers = {2,55,20,38,25,98,282,};
        List<String> res = Arrays.stream(numbers)
                .boxed()
                .map(e->String.valueOf(e))
                .filter(e->e.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}

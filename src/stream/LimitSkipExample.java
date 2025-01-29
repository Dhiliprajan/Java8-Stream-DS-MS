package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,5,4,6,4,3,7,8,6);

        // Limit
        int sum = list.stream().limit(5)
                .collect(Collectors.toList())
                .stream().reduce((a,b) -> a+b).get();
        System.out.println(sum);

        //Skip
        int sum1 = list.stream().skip(5)
                .collect(Collectors.toList())
                .stream().reduce((a,b) -> a+b).get();
        System.out.println(sum1);
    }
}

package stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListRemoveDuplicates {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Apple","Banana","Orange");
        List<String> l2 = Arrays.asList("Banana","Kiwi","Apple","Mango");
        List<String> res = Stream.concat(l1.stream(), l2.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);
    }
}

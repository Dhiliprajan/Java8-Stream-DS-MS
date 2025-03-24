package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,56,89,34,6,78);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min : "+min+" Max : "+max);
    }
}

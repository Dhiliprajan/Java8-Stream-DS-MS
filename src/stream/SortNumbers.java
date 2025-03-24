package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,3,43,4,54,7,6,40,60,0,100);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<Integer> sortedDescList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDescList);
    }
}

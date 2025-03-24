package stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,10,10,4,29,1,2,49,2,3,93,34,29);

        //Method 1
        List<Integer> dup = list.stream()
                .filter(e -> Collections.frequency(list, e)>1)
                .collect(Collectors.toList());
        System.out.println(dup);

        //Method 2
        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer> dup1 = list.stream()
                .filter(e -> !dupNum.add(e))
                .collect(Collectors.toSet());
        System.out.println(dup1);

        //Method 3
        int[] arr = {1,2,3,10,10,4,29,1,2,49,2,3,93,34,29};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        // Remove Duplicates
        List<Integer> dupList = Arrays.asList(1,2,3,10,10,4,29,1,2,49,2,3,93,34,29);
        List<Integer> uniqueList= dupList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(uniqueList);

    }
}

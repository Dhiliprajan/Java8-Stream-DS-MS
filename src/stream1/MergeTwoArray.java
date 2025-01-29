package stream1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] mergedArr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted().toArray();
        System.out.println(Arrays.toString(mergedArr));
    }
}

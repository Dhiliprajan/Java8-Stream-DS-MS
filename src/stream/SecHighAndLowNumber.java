package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecHighAndLowNumber {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,3,2,4,3,6,8,9,21,19,21,1);
//        int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
//        int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//        System.out.println(secL);
//        System.out.println(secH);
        int[] array = {45, 12, 56, 15, 24, 75, 31, 89, 89, 12};
        int secH = Arrays.stream(array)
                .boxed()
                .distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secH);
    }
}

package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecHighAndLowNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,4,3,6,8,9,21,19,21,1);
        int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
        int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secL);
        System.out.println(secH);
    }
}

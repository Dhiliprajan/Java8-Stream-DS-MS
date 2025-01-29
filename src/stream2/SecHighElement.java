package stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecHighElement {
    public static void main(String[] args) {
        int[] numbers = {5,13,41,88,99,77};
        int sec = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(sec);
    }
}

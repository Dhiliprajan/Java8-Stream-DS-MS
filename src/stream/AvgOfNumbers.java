package stream;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,2,7,5,4,64,43);
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Avg is : "+avg);
    }
}

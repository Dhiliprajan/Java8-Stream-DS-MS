package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,3,90,76);
        //method 1
        Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
        System.out.println("Sum of all numbers : "+sum.get());

        //method 2
        int sum1 = list.stream().mapToInt(e->e).sum();
        System.out.println("Sum of all numbers : "+sum1);

        //method 3
        int [] arrays = {2,4,5,2,6};
        int sum2 = Arrays.stream(arrays).sum();
        System.out.println(sum2);
    }
}

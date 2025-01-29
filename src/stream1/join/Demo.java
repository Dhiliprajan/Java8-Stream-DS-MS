package stream1.join;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1","2","3","4","5");
        String output = String.join(" > ", numbers);
        System.out.println(output);
        String out2 = String.join(" -> ", "Wakeup","Code","Sleep");
        System.out.println(out2);
    }
}

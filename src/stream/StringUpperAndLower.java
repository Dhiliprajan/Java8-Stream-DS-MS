package stream;

import java.util.Arrays;
import java.util.List;

public class StringUpperAndLower {
    public static void main(String[] args) {
        List<String> guns = List.of("Akm","M416","Uzi","kar98");
        guns.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

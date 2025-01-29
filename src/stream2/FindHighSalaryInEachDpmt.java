package stream2;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHighSalaryInEachDpmt {
    public static void main(String[] args) {
        List<Employee> employees = Stream.of(
                new Employee(1,"Dhilip","Dev",30000),
                new Employee(1,"Deepak","Dev",25000),
                new Employee(1,"Manick","BA",30000),
                new Employee(1,"Mani","Test",20000),
                new Employee(1,"Muthu","BA",40000),
                new Employee(1,"Thotha","Test",50000)
        ).collect(Collectors.toList());
        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(comparator))));
        System.out.println(map);
    }
}

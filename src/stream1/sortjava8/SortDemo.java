package stream1.sortjava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        //String
        List<String> list = Arrays.asList("Dhilip","manick","deepak","muthu","MANI");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);

        //Numbers
        List<Integer> numbers = Arrays.asList(1,7,3,4,8,5);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        //Object
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Dhilip","CSE",40000),
                new Employee(2,"Mani","CSE",65000),
                new Employee(3,"Deepak","CSE",80000),
                new Employee(4,"Manick","CSE",70000)
        );

        //Object using lambda
        employees.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
        System.out.println(employees);

        //Object using method reference
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).
                        thenComparing(Employee::getName))
                .forEach(System.out::println);

        //create comparator for name, dpmt, salary
        Comparator<Employee> sortByName = (e1,e2) -> e1.getName().compareTo(e2.getName());
        Comparator<Employee> sortByDpmt = (e1,e2) -> e1.getDept().compareTo(e2.getDept());
        Comparator<Employee> sortBySalary = (e1,e2) -> Long.compare(e1.getSalary(),e2.getSalary());

        employees.stream().sorted(sortByName
                        .thenComparing(sortByDpmt)
                        .thenComparing(sortBySalary))
                .forEach(System.out::println);
    }
}

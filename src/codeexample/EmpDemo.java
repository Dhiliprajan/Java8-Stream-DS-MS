package codeexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDemo {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1, 500));
        empList.add(new Employee(2, 1000));
        empList.add(new Employee(3, 1500));
        empList.add(new Employee(4, 2000));
        empList.add(new Employee(5, 2500));
        empList.add(new Employee(6, 3000));
        empList.add(new Employee(7, 3500));
       //Sort all employees based on their salary
       List<Employee> empSortedList= empList.stream().sorted(((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())))
                .collect(Collectors.toList());
       System.out.println(empSortedList);

       //Top 3 salaried employees
        List<Employee> top3List= empList.stream().sorted(((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3List);

        //Top 3 salaried employees
        List<Employee> low4List= empList.stream().sorted(((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary())))
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(low4List);
    }
}

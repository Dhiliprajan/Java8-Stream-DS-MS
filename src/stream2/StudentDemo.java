package java8stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
        new Student(1,"dhilip",25,"cse"),
        new Student(2,"thenu",25,"mech"),
        new Student(3,"deepak",21,"it"),
        new Student(4,"manick",22,"maths"),
        new Student(5,"muthu",19,"commerce")
    );

    Map<Integer, List<Student>> map = studentList.stream()
    .collect(Collectors.groupingBy(Student::getAge, Collectors.toList()));

    for(Map.Entry<Integer, List<Student>> entry : map.entrySet()){
        System.out.println(entry.getKey()+""+entry.getValue());
    }

    //List<Student> list = 
    //studentList.stream().forEach(System.out::println);;
    // for (Student st : list){
    //     System.out.println(st);
    // }
    }
}

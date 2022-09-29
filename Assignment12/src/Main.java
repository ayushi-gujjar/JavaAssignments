import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Student> students = StudentUtil.createStudent();
        System.out.println(students);
        students.stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}
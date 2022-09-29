import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();
        Map<String, Long> countByDept = students.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        System.out.println(countByDept);
    }
}

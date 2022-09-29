import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();

        Map<String, Long> countByGender = students.stream()
                .filter(m -> m.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(countByGender);
    }
}

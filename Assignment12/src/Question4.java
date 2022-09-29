import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        //How many males and females are there?

        List<Student> students = StudentUtil.createStudent();

        Map<String, Long> countByGender = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(countByGender);
    }
}

import java.util.List;
import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();

      students.stream().filter(m -> m.getYearOfEnrollment() > 2018).map(m -> m.getName()).forEach(System.out::println);
    }
}

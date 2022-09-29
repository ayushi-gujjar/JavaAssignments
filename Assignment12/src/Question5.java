import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();

      double avg=  students.stream().collect(Collectors.averagingInt(Student::getAge));
      System.out.println(avg);
    }
}

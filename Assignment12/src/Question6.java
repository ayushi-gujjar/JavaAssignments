import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Question6 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();
       Student studentData = students.stream().max(Comparator.comparing(Student :: getPerTillDate))
                .orElseThrow(NoSuchElementException::new);
            System.out.println(studentData);
        }
}

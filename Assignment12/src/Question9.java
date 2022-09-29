import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();
       Student data= students.stream()
               .filter(m -> m.getEngDepartment().equals("Electronic"))
               .min(Comparator.comparingInt(Student::getAge)).get();
       System.out.println(data);
    }
}

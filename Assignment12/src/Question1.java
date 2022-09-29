import java.util.List;
import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();

        //printing list of all the departments
        students.stream().map(m -> m.getEngDepartment()).forEach(System.out::println);
    }

}

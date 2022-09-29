import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();

        students.stream().filter(m -> m.getEngDepartment() == "Computer Science" && m.getGender() == "Male" ).forEach(System.out::println);
    }
}

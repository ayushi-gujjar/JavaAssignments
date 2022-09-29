public class Student {
    private int id = 0;
    private String name = null;
    private int age = 0;
    private String gender = null;
    private String engDepartment = null;
    private int yearOfEnrollment = 0;
    private double perTillDate =0;

    public Student(int id , String name , int age , String gender , String engDepartment, int year , Double date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = year;
        this.perTillDate = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEngDepartment() {
        return  engDepartment;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public Double getPerTillDate() {
        return perTillDate;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + engDepartment + ", percentage=" + perTillDate + "]";
    }
}

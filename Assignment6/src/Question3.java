import java.lang.reflect.Array;

public class Question3 {

    Question3(String value) {
        System.out.println(value + " : printing value in constructor");
    }

    public static void main(String[] args) {
        Question3[] array = new Question3[2];
        array[0] = new Question3("test value");

        //Question Number 4
        for(int index = 0; index < array.length ;index ++){
            array[index] = new Question3("Array "+index);
        }
    }
}

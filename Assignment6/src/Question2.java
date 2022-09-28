public class Question2 {
    Question2() {
        System.out.println("Constructor number 1");
        Question2 obj =new Question2("Ayushi");
    }

    Question2(String name) {
        System.out.println("Constructor numer 2  " + name);
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
    }
}

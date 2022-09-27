package Question2;

public class Question2Mai {
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = new Unicycle();
        obj[0].balance();
        obj[1] = new Bicycle();
        obj[1].balance();
        obj[2] = new Tricycle();
        obj[2].balance();
    }
}

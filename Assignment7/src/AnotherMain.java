public class AnotherMain {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].sound();
        rodent[1] = new Gerbil();
        rodent[1].sound();
        rodent[2] = new Hamster();
        rodent[2].sound();
    }
}

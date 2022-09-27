package ayushi.assigment.singleton;

public class Signleton {
    String testString;

    public static Signleton initialize(String string){
        return new Signleton();
    }

    public void printString(){
        System.out.println("test string is : "+testString);
    }
}




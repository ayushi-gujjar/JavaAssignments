package ayushi.assigment.data;

public class Data {
    int intOne;
    char charOne;

    public void printGlobalData(){
        System.out.println("global intOne: "+intOne);
        System.out.println("global charOne :"+charOne);
    }

    public void printLocalData(){
        int intTwo;
        char charTwo;
    }
}

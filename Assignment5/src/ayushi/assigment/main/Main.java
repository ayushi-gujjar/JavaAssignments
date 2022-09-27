package ayushi.assigment.main;


import ayushi.assigment.data.Data;
import ayushi.assigment.singleton.Signleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printGlobalData();
        data.printLocalData();

        Signleton singleton = Signleton.initialize("Initial String");
        singleton.printString();
    }
}
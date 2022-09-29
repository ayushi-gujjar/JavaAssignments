import java.util.regex.Pattern;

public class Main
{
    public void CheckPattern(String s1) {
        String regex="[A-Z].*[.]";
        boolean flag = Pattern.matches(regex, s1);
        if(flag){
            System.out.println("Pattern match: " +  flag);
        }
        else{
            System.out.println("Pattern does not match: "+flag);
        }
    }

    public static void main(String[] args)
    {
        String s1;
        s1 = "am good.";
        Main obj = new Main();
        obj.CheckPattern(s1);
    }
}
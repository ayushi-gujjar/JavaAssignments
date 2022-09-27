import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        File dir = new File(".");
        File [] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        for (File txtFiles : files) {
            System.out.println(txtFiles);
        }
    }
}
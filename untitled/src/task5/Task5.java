package task5;

import java.io.File;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/task5/myDirectory");
        if (!folder.exists()) {
            System.out.println(folder.mkdirs());
        }
        File file = new File(folder, "myFile.txt");
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        }

        /*
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile+" Nomli pavka va fayl yaratildi");
         */
    }
}

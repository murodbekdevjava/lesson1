package task6;

import java.io.File;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File folder = new File("src/task6/myDirectory");
        if (!folder.exists()) {
            System.out.println(folder.mkdirs());
        }
        File file = new File(folder,"myFile.txt");
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        }

        System.out.println("Yangi fayl yaratildi");

        Thread.sleep(4000);
        File deleteFile = new File("src/task6/myDirectory/myFile.txt");
        boolean delete = deleteFile.delete();
        if (delete){
            System.out.println("myFile.txt -> nomidagi fayl ochirildi");
        }else{
            System.out.println("myFile.txt -> nomidagi fayl ochirilmadi");
        }

    }
}

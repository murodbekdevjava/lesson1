package task4;

import java.time.YearMonth;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Foydalanuvch yil va oylarni kiritadi dastur esa shu yil va oydagi kunlarini
        qaytaradi
         */
        Scanner inupt= new Scanner(System.in);
        System.out.println("Yil kiriting: ");
        int year=inupt.nextInt();

        System.out.println("Oyning tartib raqamini kiriting:  ");
        int month=inupt.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        System.out.println(yearMonth.atEndOfMonth());

    }
}

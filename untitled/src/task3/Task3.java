package task3;

import java.time.LocalDate;

public class Task3 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        System.out.println(localDate+
                "  Hozirgi sana  ");
        System.out.println(localDate.minusDays(10)+
                "  Horirgi kundan 10 kun olgingi sana");

    }
}

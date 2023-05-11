package Lesson28;

import java.time.*;
import java.time.format.*;

public class Lesson28 {

    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy ");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Работаем с: " + ldt1.format(f1));
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(f1));
            System.out.println("Отдыхаем с: " + ldt1.format(f2));
            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(f2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
        Period p = Period.ofDays(3);
        Duration d = Duration.ofDays(2);

        Lesson28 l29 = new Lesson28();
        l29.smena(ldt1, ldt2, p, d);
    }

}

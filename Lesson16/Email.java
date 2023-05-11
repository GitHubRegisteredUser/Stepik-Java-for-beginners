package Lesson16;

public class Email {

    void mail(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Email n1m1 = new Email();
        n1m1.mail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

}

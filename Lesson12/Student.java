package Lesson12;

public class Student {

    public static void main(String[] args) {
        StudentTest s1 = new StudentTest("Ivan", 1, 4.4);
        StudentTest s2 = new StudentTest("Petr", 2, 4.6);
        StudentTest comp = new StudentTest();
        comp.stComp1(s1, s2);
        comp.stComp2(s1, s2);
    }

}

class StudentTest {

    String name;
    int course;
    double grade;

    StudentTest(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    StudentTest() {
    }

    void stComp1(StudentTest s1, StudentTest s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    void stComp2(StudentTest s1, StudentTest s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Студенты одинаковые");
                } else {
                    System.out.println("У студентов не одинаковые оценки");
                }
            } else {
                System.out.println("У студентов не одинаковые курсы");
            }
        } else {
            System.out.println("У студентов не одинаковые имена");
        }
    }

}

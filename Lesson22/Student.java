package Lesson22;

public class Student {

    public static void main(String[] args) {
        StudentTest s = new StudentTest();
        StringBuilder sb1 = new StringBuilder("Karl");
        s.setName(sb1);
        s.setCourse(1);
        s.setGrade(4);
        s.showInfo();
    }

}

class StudentTest {

    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 5) {
            this.course = course;
        }
    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 5) {
            this.grade = grade;
        }
    }

    void showInfo() {
        System.out.println("Имя: " + getName() + ", Курс: " + getCourse() + ", Оценка: " + getGrade());
    }

}

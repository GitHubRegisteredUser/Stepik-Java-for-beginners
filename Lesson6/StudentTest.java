package Lesson6;

public class StudentTest {

    public static void main(String[] args) {
        Student John = new Student(1, "John", "Doe", 1, 4.74F, 4.08F, 4.22F);

        Student Mary = new Student(2, "Mary", "Brown", 2);
        Mary.mathAVGScore = 4.2F;
        Mary.economicsAVGScore = 4.84F;
        Mary.foreignLanguageAVGScore = 4.20F;

        Student Ivan = new Student();
        Ivan.studentIDCard = 3;
        Ivan.studentName = "Ivan";
        Ivan.studentSurname = "Kapustin";
        Ivan.yearOfEducation = 3;
        Ivan.mathAVGScore = 4.74F;
        Ivan.economicsAVGScore = 4.42F;
        Ivan.foreignLanguageAVGScore = 4.41F;

        John.avgGrade(John);
        Mary.avgGrade(Mary);
        Ivan.avgGrade(Ivan);
    }

}

class Student {

    int studentIDCard;
    String studentName;
    String studentSurname;
    int yearOfEducation;
    float mathAVGScore;
    float economicsAVGScore;
    float foreignLanguageAVGScore;
    float GPA;

    Student(int studentIDCard1, String studentName1, String studentSurname1, int yearOfEducation1, float mathAVGScore1, float economicsAVGScore1, float foreignLanguageAVGScore1) {
        studentName = studentName1;
        studentSurname = studentSurname1;
        yearOfEducation = yearOfEducation1;
        mathAVGScore = mathAVGScore1;
        economicsAVGScore = economicsAVGScore1;
        foreignLanguageAVGScore = foreignLanguageAVGScore1;
    }

    Student(int studentIDCard2, String studentName2, String studentSurname2, int yearOfEducation2) {
        this(studentIDCard2, studentName2, studentSurname2, yearOfEducation2, 0.0F, 0.0F, 0.0F);
    }

    Student() {
        this(0, "", "", 0, 0.0F, 0.0F, 0.0F);
    }

    Float avgGrade(Student s) {
        Float GPA = (s.mathAVGScore + s.economicsAVGScore + s.foreignLanguageAVGScore) / 3;
        System.out.println(studentName + " GPA" + " is " + GPA);
        return GPA;
    }

}

package Lesson4;

public class Student {

    int studentIDCard;
    String studentName;
    String studentSurname;
    int yearOfEducation;
    float mathAVGScore;
    float economicsAVGScore;
    float foreignLanguageAVGScore;
    float GPA;

}

class StudentTest {

    public static void main(String[] args) {
        Student John = new Student();
        Student Mary = new Student();
        Student Ivan = new Student();

        John.studentIDCard = 1;
        John.studentName = "John";
        John.studentSurname = "Doe";
        John.yearOfEducation = 1;
        John.mathAVGScore = 4.74F;
        John.economicsAVGScore = 4.08F;
        John.foreignLanguageAVGScore = 4.22F;
        John.GPA = (John.mathAVGScore + John.economicsAVGScore + John.foreignLanguageAVGScore) / 3;

        Mary.studentIDCard = 2;
        Mary.studentName = "Mary";
        Mary.studentSurname = "Brown";
        Mary.yearOfEducation = 2;
        Mary.mathAVGScore = 4.2F;
        Mary.economicsAVGScore = 4.84F;
        Mary.foreignLanguageAVGScore = 4.20F;
        Mary.GPA = (Mary.mathAVGScore + Mary.economicsAVGScore + Mary.foreignLanguageAVGScore) / 3;

        Ivan.studentIDCard = 3;
        Ivan.studentName = "Ivan";
        Ivan.studentSurname = "Kapustin";
        Ivan.yearOfEducation = 3;
        Ivan.mathAVGScore = 4.74F;
        Ivan.economicsAVGScore = 4.42F;
        Ivan.foreignLanguageAVGScore = 4.41F;
        Ivan.GPA = (Ivan.mathAVGScore + Ivan.economicsAVGScore + Ivan.foreignLanguageAVGScore) / 3;

        System.out.println(John.studentName + " " + John.studentSurname + " GPA " + "is " + John.GPA);
        System.out.println(Mary.studentName + " " + Mary.studentSurname + " GPA " + "is " + Mary.GPA);
        System.out.println(Ivan.studentName + " " + Ivan.studentSurname + " GPA " + "is " + Ivan.GPA);
    }

}

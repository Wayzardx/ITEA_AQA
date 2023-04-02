package HomeWork5;

public class Student {
    int studentCardNumber;
    String studentName;
    String studentLastName;
    int courseLevel;
    int mathLevel;
    int economicLevel;
    int foreignLanguageLevel;

    public Student(int studentCardNumber, String studentName, String studentLastName, int courseLevel, int mathLevel,
                   int economicLevel, int foreignLanguageLevel) {
        this.studentCardNumber = studentCardNumber;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.courseLevel = courseLevel;
        this.mathLevel = mathLevel;
        this.economicLevel = economicLevel;
        this.foreignLanguageLevel = foreignLanguageLevel;
    }

    public int sumStudentAvarageGrade() {
        return (mathLevel + economicLevel + foreignLanguageLevel) / 3;
    }

    public String getCardLevelNameLastName() {
        return (studentCardNumber +" "+ "Course level: " + courseLevel + " Student name:  " + studentName + " " + studentLastName);
    }

}

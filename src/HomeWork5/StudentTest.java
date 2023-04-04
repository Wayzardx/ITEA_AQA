package HomeWork5;

public class StudentTest {

    public static void main(String[] args) {
        Student student3565 = new Student(3565, "Natasha", "Drone", 3, 55, 65, 43);
        Student student3566 = new Student(3566, "Alex", "Zelinskiy", 4, 75, 68, 75);
        Student student3567 = new Student(3567, "Satina", "Lafiva", 1, 95, 85, 65);

        System.out.println("Student number: " + student3565.getCardLevelNameLastName() + " " + "Avarage Grade: " + student3565.sumStudentAvarageGrade());
        System.out.println("Student number: " + student3566.getCardLevelNameLastName() + " " + "Avarage Grade: " + student3566.sumStudentAvarageGrade());
        System.out.println("Student number: " + student3567.getCardLevelNameLastName() + " " + "Avarage Grade: " + student3567.sumStudentAvarageGrade());

    }
}

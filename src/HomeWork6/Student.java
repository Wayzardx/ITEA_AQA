package HomeWork6;

public class Student {
    private String name;
    private int course;
    private int grade;

    public Student(String name, int course, int grade) {
        this.setName(name);
        this.setCourse(course);
        this.setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        if (name.length() >= 3)
            this.name = name;
        else {
            System.out.println("Error. The student's name should contain 3 or more characters but no more than 20");
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4)
            this.course = course;
        else {
            System.out.println("Error. The student's course should be 1-4");
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
        else {
            System.out.println("Error. The student's grade should be 1-10");
        }
    }

    public void showInfo() {
        System.out.println("Student name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
        System.out.println(" ");
    }
}

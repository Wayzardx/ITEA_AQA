package HomeWork5;

public class Employee {

    private int salary; // приватні з нижнього слеша.
    public String surname;
    int id;

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(int salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    public Employee(int salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public int getSalary() {
        return (salary);
    }

    public String getSurname() {
        return (surname);
    }

    public int getId() {
        return (id);
    }


}

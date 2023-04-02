package HomeWork5;

public class AnotherEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee("TAKCA");
        //Employee employee2 = new Employee(5, "Fiva");  did not work.
        Employee employee3 = new Employee(10, "Faraon", 666);

        System.out.println(employee1.surname);
        System.out.println(employee3.getSalary() + " " + employee3.id + " " + employee3.surname);
    }
}

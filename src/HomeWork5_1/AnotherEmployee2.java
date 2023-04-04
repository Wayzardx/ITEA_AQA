package HomeWork5_1;

import HomeWork5.Employee;

public class AnotherEmployee2 {
    public static void main(String[] args) {
        //Employee employee1 = new Employee("TAKCA"); // did not work (string have default modif. )
        //Employee employee2 = new Employee(5, "Fiva");  did not work(int have privete modif.)
        Employee employee3 = new Employee(10, "Faraon", 666);

        //System.out.println(employee2.salary +" "+ employee3.surname + " "+ employee3.id); // did not work when salary have privete modif. and id have default modif in another package.
        //System.out.println(employee3.getSalary() + " " + employee3.id + " " + employee3.surname);  -- employee3.id is not public!
    }
}




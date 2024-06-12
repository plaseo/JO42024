package AbstractLab;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Student s1 = new Student("Bob", "Smith");
        System.out.println(s1.toString() + "Phone Bill: " + s1.calculateTelePhoneBill(120.50));
        System.out.println(s1.toString() + "Car Ins:" + s1.carInsurance(100));
        System.out.println(s1.toString() + "Gas Bill:" + s1.calculateGasBill(50));

        Student s2 = new Student("James", "Brown");
        System.out.println(s2.toString() + "Phone Bill: " + s2.calculateTelePhoneBill(220.50));
        System.out.println(s2.toString() + "Car Ins:" + s2.carInsurance(100));
        System.out.println(s2.toString() + "Gas Bill:" + s2.calculateGasBill(50));
        
        Employee e1 = new Employee("Steve", "Jones");
        System.out.println(e1.toString() + "Phone Bill: " + e1.calculateTelePhoneBill(120.50));
        System.out.println(e1.toString() + "Car Ins:" + e1.carInsurance(100));
        System.out.println(e1.toString() + "Gas Bill:" + e1.calculateGasBill(50));

        Employee e2 = new Employee("George", "Woods");
        System.out.println(e2.toString() + "Phone Bill: " + e2.calculateTelePhoneBill(120.50));
        System.out.println(e2.toString() + "Car Ins:" + e2.carInsurance(100));
        System.out.println(e2.toString() + "Gas Bill:" + e2.calculateGasBill(50));
        
        Person p1 = new Student("Shane", "Green");
        System.out.println(p1.toString() + "Phone Bill: " + p1.calculateTelePhoneBill(120.50));
        System.out.println(p1.toString() + "Car Ins:" + p1.carInsurance(100));
        System.out.println(p1.toString() + "Gas Bill:" + p1.calculateGasBill(50));

        Person p2 = new Employee("Earl","Jones");
        System.out.println(p2.toString() + "Phone Bill: " + p2.calculateTelePhoneBill(120.50));
        System.out.println(p2.toString() + "Car Ins:" + p2.carInsurance(100));
        System.out.println(p2.toString() + "Gas Bill:" + p2.calculateGasBill(50));

        School school = new School();
        List<Student> studentArray = new ArrayList<>();
        studentArray.add(s1);
        school.addStudent(s1);
        studentArray.add(s2);
        school.addStudent(s2);

        List<Employee> employeeArray = new ArrayList<>();
        employeeArray.add(e1);
        school.addEmployee(e1);
        employeeArray.add(e2);
        school.addEmployee(e2);

        System.out.println("Students in School: " + school.getStudents());
        System.out.println("Employees in School: " + school.getEmployees());

        






    }
    
}

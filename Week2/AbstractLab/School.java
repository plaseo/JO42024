package AbstractLab;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    
    

    


    



}

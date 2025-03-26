import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ashish", 55000);
        Employee emp2 = new Employee(102, "Chetan", 60000);
        Employee emp3 = new Employee(103, "Tejas", 45000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        employeeList.stream()
        .forEach(emp -> System.out.println("ID: " + emp.getId() + 
                                            ", Name: " + emp.getName() + 
                                            ", Salary: " + emp.getSalary()));    }
}

package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Employee[] empArr = new Employee[10];
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 20, 15000, "Sales"));
        employees.add(new Employee("Александр", 23, 25000, "IT"));
        employees.add(new Employee("Татьяна", 22, 18000, "Payment"));
        employees.add(new Employee("Ольга", 29, 19000, "HR"));
        employees.add(new Employee("Анна", 25, 21000, "IT"));
        employees.add(new Employee("Сергей", 27, 15000, "Sales"));
        employees.add(new Employee("Елена", 23, 15000, "Sales"));
        employees.add(new Employee("Антон", 27, 18000, "Payment"));
        employees.add(new Employee("Илья", 30, 22000, "HR"));
        employees.add(new Employee("Андрей", 32, 20000, "Sales"));

        Collections.sort(employees);

        Collections.sort(employees, Employee.SalaryComparator);

        Collections.sort(employees, Employee.AgeComparator);

        Collections.sort(employees, Employee.DepartmentComparator);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSalary() + " " + employee.getDepartment());
        }
    }
}

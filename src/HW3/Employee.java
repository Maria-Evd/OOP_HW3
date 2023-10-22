package HW3;
import java.util.Comparator;
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;
    private String department;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public Employee(String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    @Override
    public int compareTo(Employee emp) {
        return (this.age - emp.age);
    }
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };
    public static Comparator<Employee> DepartmentComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getDepartment().compareTo(e2.getDepartment());
        }
    };

}

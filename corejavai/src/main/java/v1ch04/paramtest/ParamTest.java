package v1ch04.paramtest;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripValue:");
        double percent = 10;
        System.out.println("Before:parcent=" + percent);
        tripleValue(percent);
        System.out.println("After:parcent=" + percent);

        System.out.println("\nTesting tripSalary:");
        Employee harry = new Employee("Harry", 50000.0);
        System.out.println("Before:salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:salary=" + harry.getSalary());
        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice", 70000.0);
        Employee b = new Employee("Bob", 60000.0);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a, b);
        System.out.println("After:a=" + a.getName());
        System.out.println("After:b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method:x=" + x.getName());
        System.out.println("End of method:y=" + y.getName());
    }
}

class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

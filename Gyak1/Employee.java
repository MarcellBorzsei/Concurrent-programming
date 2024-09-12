import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements SalariedEntity {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract double getSalary();


    public void raiseSalary(double percentage)
    {
        salary += salary * percentage / 100;
    }
}

class Manager extends Employee
{
    private List<Employee> employees;

    public Manager(String name, double salary)
    {
        super(name, salary);
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee)
    {
        employees.remove(employee);
    }

    @Override
    public double getSalary()
    {
        double totalSalary = this.salary;
        for(Employee emp : employees)
        {
            totalSalary += emp.getSalary() * 0.05;
        }
        return totalSalary;
    }

}

class Subordinate extends Employee
{
    public Subordinate(String name, double salary)
    {
        super(name, salary);
    }

    @Override
    public double getSalary()
    {
        return this.salary;
    }
}
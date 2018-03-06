import java.util.ArrayList;
import java.util.List;

public class Employee implements Valuable {

    private String name;

    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Valuable> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Zdzisław",2000));
        employeeList.add(new Employee("Anna",4000));
        employeeList.add(new Employee("John",1000000));
        System.out.println(Sum.sum(employeeList));

    }

    @Override
    public int getValue() {
        return salary;
    }
}

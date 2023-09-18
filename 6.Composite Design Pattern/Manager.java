import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    List<Employee> subordinates=new ArrayList<>();

    String Name;
    String Position;

    public Manager(String name, String position) {
        Name = name;
        Position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("the employee name is : "+Name+" and his/her position is "+Position);

    }

    @Override
    public void addEmployee(Employee employee) {
        subordinates.add(employee);


    }

    @Override
    public void deleteEmployee(Employee employee) {
        subordinates.remove(employee);

    }
}

public class IndividualEmployee implements Employee{
    //this is leaf class not containing information about any other employee or no composite class
    String Name;
    String Position;

    public IndividualEmployee(String name, String position) {
        this.Name = name;
        this.Position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("the employee name is : "+Name+" and his/her position is "+Position);

    }

    @Override
    public void addEmployee(Employee employee) {
        //no need here because leaf class
    }

    @Override
    public void deleteEmployee(Employee employee) {
        //no need here because leaf class
    }
}

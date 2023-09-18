public class Main{
    public static void main(String[] args) {
        Employee emp1=new IndividualEmployee("adwait puntambekar","data scientist");
        Employee emp2=new IndividualEmployee("Aman   Joharapurkar","full stack web developer");

        Employee m1=new Manager("Abubakr Khanooni","ML projects anda data processing manager");
        m1.addEmployee(emp1);
        m1.addEmployee(emp2);

        Employee emp3=new IndividualEmployee("Atharva Telrandhe","web developer");
        Employee emp4=new IndividualEmployee("Samrat Roy","tech support");

        Employee m2=new Manager("devashree Ambegaoakr","Secretary");
        m2.addEmployee(emp3);
        m2.addEmployee(emp4);



    }
}
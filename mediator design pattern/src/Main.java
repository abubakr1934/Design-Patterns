public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague Abubakr = new ConcreteColleague(mediator, "Abu");
        Colleague Devashree = new ConcreteColleague(mediator, "Devashree");
        Colleague Aman = new ConcreteColleague(mediator, "Aman");

        mediator.addColleague(Abubakr);
        mediator.addColleague(Devashree);
        mediator.addColleague(Aman);

        Abubakr.sendMessage("Hello devashree and aman!");
        Devashree.sendMessage("hi abu i am in class ");
    }
}
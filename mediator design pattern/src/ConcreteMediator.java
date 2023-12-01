import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    public void removeColleague(Colleague colleague)
    {
        if(colleagues.contains(colleague))
        {
            colleagues.remove(colleague);
        }
        else{
            System.out.println("no employee exits recession aagya");
        }
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague c : colleagues) {

            if (c != colleague) {
                c.receiveMessage(message);
            }
        }
    }
}
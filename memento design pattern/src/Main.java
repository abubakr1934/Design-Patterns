public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());
        System.out.println("current state of the originator is "+originator.getState());

        originator.setState("State Two");
        System.out.println("current state of the originator is "+originator.getState());
        // Restoring to the previous state
        originator.getStateFromMemento(caretaker.getMemento(0));

        System.out.println("Current state of the originator object is: " + originator.getState());
    }
}
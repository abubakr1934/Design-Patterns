import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento state) {
        mementoList.add(state);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
package Observer;

import java.util.ArrayList;
import java.util.List;

public class Mail implements Subject{

    private List<Observer> observerList;
    private String topicName;

    public Mail(String topicName) {
        this.observerList = new ArrayList<>();
        this.topicName = topicName;
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(topicName);
        }
    }
}

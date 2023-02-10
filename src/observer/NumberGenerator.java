package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class NumberGenerator {

    //Observer를 저장한다
    private List<Observer> observers = new ArrayList<>();

    //Observer를 추가한다.
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    //Observer에 통지한다
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);

        }
    }

    // 숫자를 얻는다
    public abstract int getNumber();

    // 숫자를 생성한다.
    public abstract void execute();
}

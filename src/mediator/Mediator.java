package mediator;

public interface Mediator {
    //Colleague를 생성한다
    public abstract void createColleagues();

    //Colleague의 상태가 변화 했을 때 호출
    public abstract void colleagueChanged();
}

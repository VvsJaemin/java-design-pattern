package strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    //이름과 전략을 받아서 플레이어를 만든다

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    //전략에 따라 다음 손을 결정한다.
    public Hand nextHand() {
        return strategy.nextHand();
    }

    //승리
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    //패배
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    //무승부
    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "{"
                + name + ":"
                + gameCount + " games, "
                + winCount + " win, "
                + loseCount + " lose"
                + "}";
    }
}

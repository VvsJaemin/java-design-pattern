package strategy;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int handvalue;

    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    // 손의 값으로 enum 상수를 가져온다.
    public static Hand getHand(int handvalue) {

        return hands[handvalue];
    }

    //this가 h보다 강할 때 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    //this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    //무승부가 0, this가 이기면 1, h가 이기면 -1
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return name;
    }
}

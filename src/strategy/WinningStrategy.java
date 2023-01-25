package strategy;

import java.util.Random;

public class WinningStrategy implements Strategy{

    private Random random;
    private boolean won = false;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() { // 졌을 경우 -> 랜덤
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) { // 이겼을 경우 -> 같은거 또 내기
        won = win;
    }
}

package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        args = new String[]{"0","1"};
        if (args.length != 2) {
            System.out.println("Usage : java Main randomseed1 randomseed2");
            System.out.println("Example : java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("KIM", new WinningStrategy(seed1));
        Player player2 = new Player("LEE", new RandomStrategy(seed2));

        for (int i = 0; i < 10; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                player1.win();
                player2.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                player1.lose();
                player2.win();
            }else{
                System.out.println("무승부");
                player1.even();
                player2.even();
            }

        }
        System.out.println("게임 결과는 ? ");
        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
    }
}

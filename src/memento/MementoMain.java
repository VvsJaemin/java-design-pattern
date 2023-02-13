package memento;

public class MementoMain {

    private static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = Memento.loadFromFile(SAVEFILENAME);

        if (memento == null) {
            System.out.println("새로 시작합니다.");
            memento = gamer.createMemento();
        } else {
            System.out.println("이전에 저장한 결과부터 시작합니다.");
            gamer.restoreMemento(memento);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            System.out.println("상태:" +gamer);

            gamer.bet();

            System.out.println("소지금은  = " + gamer.getMoney());

            //Memento 방법 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("처음보다 돈 증가, 현재 상태를 저장");
                memento = gamer.createMemento();
                if (Memento.saveToFile(SAVEFILENAME, memento)) {
                    System.out.println("현재 상태를 파일로 저장했습니다.");
                }
            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("처음보다 돈이 줄었으니 이전 상태로 복원");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println();
        }

    }
}

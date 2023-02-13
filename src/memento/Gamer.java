package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;

    private List<String> fruits = new ArrayList<>();

    private Random random = new Random();

    //과일 이름 표
    public static String[] fruitsName = {
            "사과", "포도", "바나나", "오렌지"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    //내기한다 - 게임 진행
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            // 소지금 증가
            money += 100;
            System.out.println("소지금이 증가했습니다.");
        } else if (dice == 2) {
            // 소지금 절반
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다.");
        } else if (dice == 6) {
            // 과일을 받는다.
            String f = getFruit();
            System.out.println("과일(" + f + ")를 받았습니다");
        } else {
            // 변동 사항 없음
            System.out.println("변동 사항이 없습니다.");
        }
    }

    //스냅샷을 찍는다
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String f : fruits) {
            //과일은 맛있는 것만 저장
            if (f.startsWith("맜있는")) {
                memento.addFruit(f);
            }
        }
        return memento;
    }

    //복원한다
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    //과일 하나 얻는다
    private String getFruit() {
        String f = fruitsName[random.nextInt(fruitsName.length)];
        if (random.nextBoolean()) {
            return "맛있는 " + f;
        } else {
            return f;
        }
    }
}

package bridge;

import bridge.func.CountDisplay;
import bridge.func.Display;
import bridge.func.IncreaseDisplay;
import bridge.func.RandomCountDisplay;
import bridge.impl.CharDisplayImpl;
import bridge.impl.FileDisplayImpl;
import bridge.impl.StringDisplayImpl;

public class BridgeMain {
    public static void main(String[] args) {

        // Bridge 패턴의 특징 -> 분리해 두면 확장 편해짐 (기능, 구현의 클래스 계층을 분리 -> 독립적 확장 가능)
        // 기능을 추가 하고 싶으면 기능 클래스에, 구현 클래스 계층은 수정할 필요가 없음, 새로 추가한 기능은 모든 구현에서 이용 가능
        // 상속은 결합도가 강하고, 위임은 결합도가 약하다.
        // Display 클래스에서  메소드만 생성하고 impl에 떠넘김 -> 위임
//        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
//        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
//        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
//        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Random"));
//        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("star.txt"));
//
//        d1.display();
//        d2.display();
//        d3.display();
//        d3.multiDisplay(5);
//        d4.multiDisplay(5);
//        d5.multiDisplay(5);

        IncreaseDisplay d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);

        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}

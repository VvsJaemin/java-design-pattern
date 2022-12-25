package templatemethod;

import java.io.InputStream;

public class TemplateMethodMain {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H');

        StringDisplay d2 = new StringDisplay("Hello, World");

        //d1, d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        //상속한 display의 메소드를 호출 할 수 있다.
        //실제 동작은 하위 클래스에서 정해진다.
        d1.display();
        d2.display();


    }
}

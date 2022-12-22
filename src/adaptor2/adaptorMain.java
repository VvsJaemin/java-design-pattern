package adaptor2;

public class adaptorMain { // client 역할(노트북)
    // 상속의 상위 클래스의 내부 동작을 모르면 상속을 효과적으로 사용하기 어려움.
    // 그리하여 어뎁터 역할하는 클래스에 객체를 위임하여 사용하는 것이 좋다.
    public static void main(String[] args) {

        PrintBanner printBanner = new PrintBanner("hello2");

        printBanner.printWeak();
        printBanner.printStrong();

    }
}

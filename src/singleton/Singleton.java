package singleton;
// 여러 인스턴스를 생성하기 위한 속도를 일부러 느리게 하는 메서드 생성
public class Singleton {
    private static Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("하나의 인스턴스를 생성했습니다.");
        slowDown();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}

package singleton;
// 여러 인스턴스를 생성하기 위한 속도를 일부러 느리게 하는 메서드 생성
public class Singleton {
    private static Singleton singleton = null;

    public Singleton() {
        System.out.println("하나의 인스턴스를 생성했습니다.");
        slowDown();
    }

    public static synchronized Singleton getInstance() { //엄격한 싱글턴 패턴 적용(synchornized)
        if (singleton == null) { // 조건 판단이 엄격하지 않기 때문에(스레드 세이프) 싱글턴이 아님
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowDown() { // 초기화를 지연 시키는 지연 초기화
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}

package singleton;
// 여러 스레드에서 싱글턴을 호출
public class SingletonThreadMain extends Thread {
    public static void main(String[] args) {
        System.out.println("SingletonThreadMain.main");

        new SingletonThreadMain("A").start();
        new SingletonThreadMain("B").start();
        new SingletonThreadMain("C").start();

        System.out.println("SingletonThreadMain.mai1n");
    }

    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("instance = " + instance);
    }

    public SingletonThreadMain(String name) {
        super(name);
    }
}

package observer;

public class ObserverMain {
    public static void main(String[] args) {
        NumberGenerator generator1 = new RandomNumberGenerator();
        NumberGenerator generator2 = new IncrementalNumberGenerator(10, 50, 5);

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator1.addObserver(observer1);
        generator2.addObserver(observer2);

        generator1.execute();
        generator2.execute();
    }
}

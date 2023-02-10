package observer;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("generator.getNumber() = " + generator.getNumber());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}

package bridge.impl;

public class CharDisplayImpl extends DisplayImpl{
    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.println("head = " + head);
    }

    @Override
    public void rawPrint() {
        System.out.println("body = " + body);
    }

    @Override
    public void rawClose() {
        System.out.println("foot = " + foot);
    }
}

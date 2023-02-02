package chainofresponsibility;

public class LimitSupport extends Support {

    private int limit; // 이 번호 미만이면 해결 가능

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}

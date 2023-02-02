package chainofresponsibility;

public abstract class Support {

    private String name;
    private Support next; //트러블을 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    //떠넘길 곳을 설정한다.
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    //트러블 해결 절차를 결정한다.
    public void support(Trouble  trouble) {
        // 루프 방식
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }

        // if 방식
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    // 트러블 해결 하려고 한다.
    protected abstract boolean resolve(Trouble trouble);

    // 트러블 해결 완료
    protected void done(Trouble trouble) {
        System.out.println("this = " +this);
        System.out.println("trouble = " + trouble);
    }

    // 트러블이 해결 되지 않았다.
    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved");
    }
}

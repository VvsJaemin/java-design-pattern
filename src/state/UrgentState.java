package state;

public class UrgentState implements State{

    private static UrgentState singleton = new UrgentState();
    public UrgentState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 긴급 상황으로 시간은 설정하지 않는다.
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상 시 금고 사용");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(비상시)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(비상시)");
    }

    @Override
    public String toString() {
        return "[비상시]";
    }
}

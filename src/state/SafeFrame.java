package state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context {
    private TextField textClock = new TextField(60); //현재 시간
    private TextArea textScreen = new TextArea(10, 60);  // 경비 센터 출력

    private Button buttonUse = new Button("금고 사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반 통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance(); // 현재 상태

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);


        //버튼이 눌렸을 때 -> 리스너를 람다식으로 설정
        buttonUse.addActionListener(e-> state.doUse(this));
        buttonAlarm.addActionListener(e -> state.doAlarm(this));
        buttonPhone.addActionListener(e-> state.doPhone(this));
        buttonExit.addActionListener(e->System.exit(0));

        pack();
        setVisible(true);
    }

    @Override
    public void setClock(int hour) {
        String clockString = String.format("현재 시간은 %02d:00", hour);
        System.out.println("clockString = " + clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서" + state + "으로 상태가 변화했습니다.");
    }

    @Override
    public void callSecurityCenter(String msg) { // 경비 센터 경비원 호출
         textScreen.append("Call! " +msg + "\n");
    }

    @Override
    public void recordLog(String msg) { // 경바 센터 기록
        textScreen.append("record ... " + msg + "\n");
    }
}

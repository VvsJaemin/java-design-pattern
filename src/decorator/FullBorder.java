package decorator;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+"; //상단 테두리
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+"; //하단 테두리

        } else {
            return "|" + display.getRowText(row - 1) + "|"; // 기타

        }
    }

    //문자 ch로 count 수만큼 연속한 문자열을 만든다.
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}

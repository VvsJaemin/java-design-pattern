package decorator;

public class UpdownBorder extends Border{

    private char borderChar;
    public UpdownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            // 맨 위와 맨 아래는 장식 문자만의 행re
            return makeLine(borderChar, getColumns());
        }else{
            // 내용물의 행 (맨 위 행수만큼 행 번호를 줄인다.)
            return display.getRowText(row-1);
        }
    }

    // 문자 ch로 count수만큼 연속한 문자열을 만든다.
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}

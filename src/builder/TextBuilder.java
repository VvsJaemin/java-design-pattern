package builder;

public class TextBuilder implements Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("========================");
        sb.append("[");
        sb.append(title);
        sb.append("\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("a");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append(" .");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");

    }

    @Override
    public void close() {
        sb.append("=======================");
    }

    public String getTextResult() {
        return sb.toString();
    }
}

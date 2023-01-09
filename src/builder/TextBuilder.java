package builder;

public class TextBuilder extends Builder{
    private StringBuilder sb = new StringBuilder();
    @Override
    void makeTitle(String title) {
        sb.append("========================");
        sb.append("[");
        sb.append(title);
        sb.append("\n\n");
    }

    @Override
    void makeString(String str) {
        sb.append("a");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    void makeItems(String[] items) {
        for (String s : items) {
            sb.append(" .");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");

    }

    @Override
    void close() {
        sb.append("=======================");
    }

    public String getTextResult() {
        return sb.toString();
    }
}

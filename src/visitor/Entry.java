package visitor;

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    //문자열 표현
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

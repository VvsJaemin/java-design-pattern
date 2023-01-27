package composite;

public abstract class Entry {

    private Entry parent;

    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    //전체 경로 메서드
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        Entry entry = this;
        do {
            fullName.insert(0, entry.getName());
            fullName.insert(0, "/");
            System.out.println("entry = " + entry);
            entry = entry.parent;
        } while (entry != null);{
            return fullName.toString();
        }
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

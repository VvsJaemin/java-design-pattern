package singleton;

public class TripleMain {
    public static void main(String[] args) {
        Triple.getInstance("ALPHA");
        Triple.getInstance("BETA");
        Triple.getInstance("GAMMA");
    }
}


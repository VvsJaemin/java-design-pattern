package singleton;

public enum Triple {
    ALPHA, BETA, GAMMA;
    public static Triple getInstance(String name) {
        System.out.println("name = " + name);
        return valueOf(name);
    }

}

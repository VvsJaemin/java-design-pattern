package singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TripleMap {
    private static Map<String, TripleMap> map = new HashMap<>();

    static {
        String[] names = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(s -> map.put(s, new TripleMap(s)));

    }

    private String name;
    private TripleMap(String name) {
        System.out.println("name = " + name);
    }

    public static TripleMap getInstance(String name) {
        return map.get(name);
    }

}

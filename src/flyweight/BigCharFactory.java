package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    //  이미 만든 BigChar 인스턴스를 관리
    private Map<String, BigChar> pool = new HashMap<>();

    //singleton 패턴
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {

    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }

        return bc;
    }

}

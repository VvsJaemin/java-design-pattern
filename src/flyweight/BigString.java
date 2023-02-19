package flyweight;

public class BigString {
    //'큰 문자'의 배열
    private BigChar[] bigChars;

    public BigString(String string) {
       initShared(string);
    }

    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnShared(string);
        }
    }

    // 공유하고 초기화
    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 공유하지 않고 초기화
    private void initUnShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (BigChar bc : bigChars) {
            bc.print();
        }
    }
}

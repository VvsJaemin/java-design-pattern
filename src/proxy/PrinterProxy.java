package proxy;

public class PrinterProxy implements Printable{ // 프록시 객체

    private String name; // 이름
    private Printable real; // '본인'

    private String className; // '본인' 클래스 이름


    public PrinterProxy(String name, String className) {
        this.name = name;
        this.real = null;
        this.className = className;
    }

    @Override
    public  synchronized void setPrinterName(String name) {
        if (real != null) {
            // '본인'에게도 설정한다.
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // 본인 생성
    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).getDeclaredConstructor().newInstance();
            } catch (ClassNotFoundException e) {

            } catch (Exception e) {

            }
        }
    }
}

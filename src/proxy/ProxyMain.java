package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Jaemin", "Printer");
        System.out.println("p.getPrinterName() = " + p.getPrinterName());
        p.setPrinterName("jm");
        System.out.println(p.getPrinterName());
        p.print("Hello Print");
    }
}

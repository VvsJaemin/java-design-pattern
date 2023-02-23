package proxy;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer 인스턴스 생성 중");
    }

    // 이름 지정(생성자)
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer 인스턴스(" + name + ") 생성 중");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {

    }

    @Override
    public String getPrinterName() {
        return null;
    }

    // 이름 붙여서 표시
    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(".");
        }
        System.out.println("완료");
    }
}

package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    public PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename)  {
        try {

        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailaddr);
        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
        writer.title(username + "'s web page");
        writer.paragraph("Welcome to " +username + "'s  web page");
        writer.paragraph("Nice to Meet You");
        writer.mailto(mailaddr, username);
        writer.close();
        System.out.println("filename+ \"is created by\" + mailaddr +\"(\"+username+\")\" = " + filename + "is created by" + mailaddr + "(" + username + ")");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link Page");
            Properties mailprop = Database.getProperties("maildata");
            for (String mailaddr : mailprop.stringPropertyNames()) {
                String username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

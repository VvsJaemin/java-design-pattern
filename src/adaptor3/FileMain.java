package adaptor3;

import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("'f' = " + 'f');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

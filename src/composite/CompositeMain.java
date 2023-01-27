package composite;

public class CompositeMain {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        rootDir.printList();
        System.out.println();

        Directory jm1 = new Directory("jm1");
        Directory jm2 = new Directory("jm2");
        Directory jm3 = new Directory("jm3");

        usrDir.add(jm1);
        usrDir.add(jm2);
        usrDir.add(jm3);

        File file = new File("Composite.java", 100);
        jm1.add(file);

        jm1.add(new File("jm1.html", 10000));
        jm2.add(new File("jm2.html", 20000));
        jm3.add(new File("jm3.html", 30000));

        rootDir.printList();


        System.out.println("file. = " + file.getFullName());
        System.out.println("jm1 = " + jm1.getFullName());


    }
}

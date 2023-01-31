package visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class VisitorMain {

    static class MyFileVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println("dir : " + dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

            System.out.println("file : " + file);
            return FileVisitResult.CONTINUE;
        }
    }
    public static void main(String[] args) {
        System.out.println("Making root entries");

        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));

        rootdir.accept(new ListVisitor());
        System.out.println();

        System.out.println("Making user entries");
        Directory jaemin = new Directory("jaemin");
        Directory gildong = new Directory("gildong");
        Directory dojun = new Directory("dojun");

        usrdir.add(jaemin);
        usrdir.add(gildong);
        usrdir.add(dojun);

        jaemin.add(new File("diary.html", 100));
        jaemin.add(new File("Composite.html", 200));
        gildong.add(new File("memo.tex", 300));
        dojun.add(new File("game.doc", 400));
        dojun.add(new File("junk.mail", 500));

        rootdir.accept(new ListVisitor());

        FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
        rootdir.accept(fileFindVisitor);

        for (File file : fileFindVisitor.getFoundFiles()) {
            System.out.println(file);

        }

        String dirname = "dir";
        try {
            MyFileVisitor visitor = new MyFileVisitor();
            Path root = Path.of(dirname);
            Files.walkFileTree(root, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

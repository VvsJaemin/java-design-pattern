package builder;


public class BuilderMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Direct direct = new Direct(textBuilder);
            direct.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if (args[1].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Direct direct = new Direct(htmlBuilder);
            direct.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("파일 작성 = " + filename);
        } else {
            usage();
            System.exit(0);

        }
    }

    public static void usage() {
        System.out.println("텍스트로 문서 작성");
        System.out.println("HTML로 작성");
    }
}

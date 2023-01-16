package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("filename.html -> class.name.of.Concrete Factory");

            System.out.println("list.html -> listfactory.ListFactory");
            System.out.println("div.html -> divfactory.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);


        //Blog
        Link blog1 = factory.createLink("Blog 1", "https://www.daum.net");
        Link blog2 = factory.createLink("Blog 2", "https://www.naver.com");
        Link blog3 = factory.createLink("Blog 3", "https://www.nate.com");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        //News
        Link news1 = factory.createLink("News 1", "https://news.naver.com/");
        Link news2 = factory.createLink("News 2", "https://news.nate.com/section?mid=n0400&n=972454#cid972454");
        Link news3 = factory.createLink("News 3", "https://news.daum.net//");

        Tray newsTray = factory.createTray("News Page");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);


//        Page page = factory.createPage("Blog and News", "개타원");
        Page page = factory.createNaverPage();
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);

    }
}

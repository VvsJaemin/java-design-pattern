package abstractfactory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("classname = " + classname);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract  Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    public  Page createNaverPage(){
        Link link = createLink("naver", "www.naver.com");
        Page page = createPage("Naver", "Naver");
        page.add(link);
        return page;
    };
}

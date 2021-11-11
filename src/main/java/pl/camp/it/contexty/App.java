package pl.camp.it.contexty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.it.contexty.configuration.AppConfiguration;
import pl.camp.it.contexty.gui.GUI;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        GUI gui = context.getBean(GUI.class);
        gui.showCos();
    }
}

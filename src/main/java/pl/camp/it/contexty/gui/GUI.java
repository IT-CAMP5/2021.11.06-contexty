package pl.camp.it.contexty.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.camp.it.contexty.database.DB2;
import pl.camp.it.contexty.database.Database;
import pl.camp.it.contexty.database.IDatabase;

@Component
public class GUI {

    @Autowired
    IDatabase database;

    public void showCos() {
        System.out.println("Coś wyświetlam !!!");
        this.database.saveData();
    }
}

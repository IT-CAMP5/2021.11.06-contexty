package pl.camp.it.contexty.database;

import org.springframework.stereotype.Component;

@Component
public class DB2 implements IDatabase {

    public void saveData() {
        System.out.println("Zapisuję dane po nowemu !!!");
    }
}

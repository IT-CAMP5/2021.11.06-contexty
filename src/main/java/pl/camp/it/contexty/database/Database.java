package pl.camp.it.contexty.database;

import org.springframework.stereotype.Component;

public class Database implements IDatabase {

    @Override
    public void saveData() {
        System.out.println("Zapisuję dane !!!");
    }
}

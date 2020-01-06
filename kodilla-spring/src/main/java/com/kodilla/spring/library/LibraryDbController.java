package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {
    public void saveData() {
        System.out.println("Saving data to database");
    }

    public void loadData(){
        System.out.println("Loading data from database");
    }
}

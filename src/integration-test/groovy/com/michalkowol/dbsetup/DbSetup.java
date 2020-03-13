package com.michalkowol.dbsetup;

import com.michalkowol.demodata.CompositeDemoData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Component
public class DbSetup {

    private final DbCleaner dbCleaner;
    private final CompositeDemoData compositeDemoData;

    @PostConstruct
    public void setupDB() {
        dbCleaner.clearTables();
        compositeDemoData.addDemoData();
    }

    public void clearTables() {
        dbCleaner.clearTables();
    }
}

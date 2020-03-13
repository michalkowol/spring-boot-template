package com.michalkowol.dbsetup;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.security.AccessControlException;

import static com.michalkowol.dbsetup.ClearableTables.clearableTables;

@RequiredArgsConstructor
@Component
class DbCleaner {

    private final DbGuardian dbGuardian;
    private final JdbcTemplate jdbcTemplate;

    void clearTables() {
        checkDbCleaningAllowed();
        clearableTables().forEach(this::clearTable);
    }

    private void clearTable(String tableName) {
        jdbcTemplate.update("DELETE FROM " + tableName); // this is only for test - no SQL injection possible
    }

    private void checkDbCleaningAllowed() {
        if (!dbGuardian.isDbCleaningAllowed()) {
            throw new AccessControlException("DB cleaning forbidden");
        }
    }
}

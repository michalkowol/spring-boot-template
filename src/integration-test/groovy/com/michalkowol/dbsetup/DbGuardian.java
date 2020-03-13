package com.michalkowol.dbsetup;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
class DbGuardian {

    private static final long NUMBER_OF_ELEMENTS_TO_CONSIDER_RISKY = 200L;

    private final NamedParameterJdbcTemplate jdbcTemplate;

    boolean isDbCleaningAllowed() {
        int rows = countEntities();
        boolean allowed = rows < NUMBER_OF_ELEMENTS_TO_CONSIDER_RISKY;
        if (!allowed) {
            log.warn("Rows = {}", rows);
        }
        return allowed;
    }

    private int countEntities() {
        return jdbcTemplate.queryForObject("SELECT COUNT(0) FROM articles", Map.of(), Integer.class);
    }
}

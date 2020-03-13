package com.michalkowol.dbsetup;

import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
final class ClearableTables {

    static List<String> clearableTables() {
        return List.of(
            "articles"
        );
    }
}

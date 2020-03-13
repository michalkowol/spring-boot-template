package com.michalkowol.demodata;

import com.michalkowol.model.Article;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)

public final class ArticleFixtures {

    public static final Article FOO = new Article(UUID.fromString("4f4f8f4e-2b51-4937-98cd-f98c4b91a4af"), "foo");
    public static final Article BAR = new Article(UUID.fromString("e1cac144-efe0-4497-975b-b7dfd7942471"), "foo");
}

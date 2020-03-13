package com.michalkowol.demodata;

import com.michalkowol.article.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ArticleDemoData implements DemoData {

    private final ArticleRepository repository;

    @Override
    public void addDemoData() {
        repository.save(ArticleFixtures.FOO);
        repository.save(ArticleFixtures.BAR);
    }
}

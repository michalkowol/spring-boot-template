package com.michalkowol.article;

import com.michalkowol.model.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
class ArticleService {

    private final ArticleRepository repository;

    List<Article> finaAll() {
        return repository.findAll();
    }

    public void save(String title) {
        UUID id = UUID.randomUUID();
        Article article = new Article(id, title);
        repository.save(article);
    }
}

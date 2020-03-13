package com.michalkowol.article;

import com.michalkowol.model.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
class ArticleController {

    private final ArticleService fooService;
    private final ArticleMapper articleMapper;

    @GetMapping("/articles")
    public List<ArticleDto> getArticles() {
        List<Article> articles = fooService.finaAll();
        return articleMapper.map(articles);
    }

    @PostMapping("/articles")
    public void saveArticles(@RequestBody ArticleRequest foo) {
        fooService.save(foo.getTitle());
    }
}

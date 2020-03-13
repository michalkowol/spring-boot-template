package com.michalkowol.article;

import com.michalkowol.base.BaseMapperConfig;
import com.michalkowol.model.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = BaseMapperConfig.class)
interface ArticleMapper {

    ArticleDto map(Article article);

    List<ArticleDto> map(List<Article> articles);
}

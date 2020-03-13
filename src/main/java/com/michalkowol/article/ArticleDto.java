package com.michalkowol.article;

import lombok.Data;

import java.util.UUID;

@Data
class ArticleDto {

    private UUID id;
    private String title;
}

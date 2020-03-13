package com.michalkowol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    private UUID id;

    private String title;

    private Instant createdAt = Instant.now();

    private Instant lastModifiedAt = Instant.now();

    public Article(UUID id, String title) {
        this.id = id;
        this.title = title;
    }
}

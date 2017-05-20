package com.fast87.article;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//유일하게 존재하는 것
@Getter
public class Article {

    @Id // 유일함을 보장하는 것
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private String body;

    protected Article() {}// 빈생성자가 없으면 JPA에서 리플렉션을 할 수 없음

    public Article(String title, String author, String body) {
        this.title = title;
        this.author = author;
        this.body = body;
    }
}

package com.ori.fantastic.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Article {

    @Field()
    private Long ficitonId;
    private String title;
    private String content;
    private Author author;

}

package com.fast87;

import com.fast87.article.Article;
import com.fast87.article.ArticleRepository;
import com.fast87.article.Comment;
import com.fast87.article.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Board2Application {

	public static void main(String[] args) {
		SpringApplication.run(Board2Application.class, args);
	}

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	CommentRepository commentRepository;

	@PostConstruct
	public void testCrud(){
		Article article1 = articleRepository.save(new Article("title1", "author1", "body1"));
		Article article2 = articleRepository.save(new Article("title2", "author2", "body2"));
		Article article3 = articleRepository.save(new Article("title3", "author3", "body3"));

		commentRepository.save(new Comment(article1, "body1", "author1"));
		commentRepository.save(new Comment(article2, "body2", "author2"));
		commentRepository.save(new Comment(article3, "body3", "author3"));
		commentRepository.save(new Comment(article1, "body4", "author4"));

		System.out.println(articleRepository.findbyAuthor("author3"));
	}

}

package com.fast87;

import com.fast87.article.Article;
import com.fast87.article.ArticleRepository;
import com.fast87.article.Comment;
import com.fast87.article.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

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
		Article article = articleRepository.save(new Article("title,", "author", "body"));

		Comment comment = commentRepository.save(new Comment(article, "body", "author"));

		List<Article> all = articleRepository.findAll();
		System.out.println("getComment : " + article.getComments().get(0).getId());
		System.out.println("getArticle : " + comment.getArticle());

		Article one = articleRepository.getOne(1L);

	}
}

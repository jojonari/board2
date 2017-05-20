package com.fast87;

import com.fast87.article.Article;
import com.fast87.article.ArticleRepository;
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
	ArticleRepository repository;

	@PostConstruct
	public void testCrud(){
		repository.save(new Article("title,", "author", "body"));
		repository.save(new Article("title,", "author", "body"));
		repository.save(new Article("title,", "author", "body"));
		repository.save(new Article("title,", "author", "body"));
		repository.save(new Article("title,", "author", "body"));

		List<Article> all = repository.findAll();
		System.out.println(all);

	}
}

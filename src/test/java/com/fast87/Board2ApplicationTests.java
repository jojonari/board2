package com.fast87;

import com.fast87.article.ArticleRepository;
import org.hibernate.validator.constraints.EAN;
import org.hibernate.validator.internal.constraintvalidators.bv.past.PastValidatorForDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Board2ApplicationTests {

	@Autowired
	ArticleRepository repository;


	@Test
	public void contextLoads() {
		repository.findbyAuthor("xkgun");
	}

}

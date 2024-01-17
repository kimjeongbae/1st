package com.start.st;

import com.start.st.domain.article.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ArticleService articleService;

	@Test
	void contextLoads() {
		articleService.create("제목입니다","내용입니다");
	}

}

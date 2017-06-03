package com.fast87.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jojonari on 2017. 5. 27..
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}

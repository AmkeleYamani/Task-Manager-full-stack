package com.application.task_springboot.repositories;

import com.application.task_springboot.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : A.S.M.M.U.P.Adhikaram
 * @Since : 10/4/2024
 * @Time : 7:49 PM
 **/

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}

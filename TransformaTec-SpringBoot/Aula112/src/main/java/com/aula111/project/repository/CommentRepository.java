package com.aula111.project.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula111.project.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    
    List<Comment> findByTutorialId(long tutorialId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
    
}

package com.aula111.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula111.project.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{

    List<Tutorial> findByPublished(Boolean published);

    List<Tutorial> findByTitleContaining(String title);

    Tutorial findById(long id);
    
}

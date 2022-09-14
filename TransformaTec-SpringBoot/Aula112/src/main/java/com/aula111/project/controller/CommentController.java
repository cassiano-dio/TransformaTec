package com.aula111.project.controller;

import java.lang.module.ResolutionException;
import java.util.List;

import javax.management.relation.RelationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula111.project.model.Comment;
import com.aula111.project.repository.CommentRepository;
import com.aula111.project.repository.TutorialRepository;

@RestController
@RequestMapping("/api")
public class CommentController {
    
    @Autowired
    private TutorialRepository tutorialRepository;

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<Comment> createComment(@PathVariable(value = "tutorialId") Long tutorialId,@RequestBody Comment commentRequest){

        Comment comment = tutorialRepository.findById(tutorialId).map(tutorial -> {
        commentRequest.setTutorial(tutorial);
        return commentRepository.save(commentRequest);

        }).orElseThrow(() -> new ResolutionException("Tutorial nao encontrato: " + tutorialId));
        
            return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @GetMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<List<Comment>> getAllCommentsByTutorialId(@PathVariable(value = "tutorialId") Long tutorialId){

        if(!tutorialRepository.existsById(tutorialId)){
            throw new ResolutionException("Tutorial inexistente: " + tutorialId);
        }

        List<Comment> comments = commentRepository.findByTutorialId(tutorialId);

        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
    
    @DeleteMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<List<Comment>> deleteAllCommentsByTutorialId(@PathVariable(value = "tutorialId") Long tutorialId){
        if (!tutorialRepository.existsById(tutorialId)) {
            throw new ResolutionException("Tutorial inexistente: " + tutorialId);
        }

        commentRepository.deleteByTutorialId(tutorialId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/comments/{id}")
    public ResponseEntity<HttpStatus> deleteComment(@PathVariable("id") Long id){

        commentRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}

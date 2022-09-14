package com.aula111.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aula111.project.model.Tutorial;
import com.aula111.project.repository.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    TutorialRepository repo;

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        Tutorial _tutorial = repo.save(tutorial);
        return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials(){

        List<Tutorial> _tutorials = new ArrayList<Tutorial>();

        repo.findAll().forEach(_tutorials::add);

        if(_tutorials.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);   
        }

        return new ResponseEntity<>(_tutorials, HttpStatus.OK);

    }

    @GetMapping("/tutorials/title")
    public ResponseEntity<List<Tutorial>> getTutorialsByTitle(@RequestParam(required = true) String title){

        List<Tutorial> tutorials = new ArrayList<Tutorial>();

        repo.findByTitleContaining(title).forEach(tutorials::add);

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);

    }

    
    @GetMapping("/tutorials/status/{status}")
    public ResponseEntity<List<Tutorial>> getPublished(@PathVariable("status") boolean status){
        List<Tutorial> _tutorials = repo.findByPublished(status);

        if (_tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(_tutorials, HttpStatus.OK);
    }

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id){
        Tutorial _tutorial = repo.findById(id);

        if(_tutorial == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);   
        }

        return new ResponseEntity<>(_tutorial,HttpStatus.OK);
    }

    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial){

        Tutorial _tutorial = repo.findById(id);

        _tutorial.setTitle(tutorial.getTitle());
        _tutorial.setDescription(tutorial.getDescription());
        _tutorial.setPublished(tutorial.getPublished());

        return new ResponseEntity<>(repo.save(_tutorial), HttpStatus.OK);

    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id){

        repo.deleteById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    
}

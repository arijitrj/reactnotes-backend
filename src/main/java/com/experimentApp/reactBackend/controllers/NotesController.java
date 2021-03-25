package com.experimentApp.reactBackend.controllers;


import com.experimentApp.reactBackend.entity.Note;
import com.experimentApp.reactBackend.repo.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {

    @Autowired
    NotesRepo notesRepo;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes(){


        return new ResponseEntity<List<Note>>(notesRepo.findAll(), HttpStatus.OK);
    }
}

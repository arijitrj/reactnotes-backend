package com.experimentApp.reactBackend.repo;

import com.experimentApp.reactBackend.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotesRepo extends JpaRepository<Note, Long> {


}

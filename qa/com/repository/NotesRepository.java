package qa.com.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import qa.com.model.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {

}

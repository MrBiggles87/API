package qa.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import qa.com.model.Note;


@RestController
@RequestMapping("api/v1")
public class NoteController {
	
	@Autowired
	private qa.com.repository.NotesRepository NotesRepository;
	
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list(){
		return NotesRepository.findAll();
	}
	
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {
		return NotesRepository.saveAndFlush(note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note getNote(@PathVariable Long id) {
		return NotesRepository.findOne(id);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {
		Note existingNote = NotesRepository.findOne(id);
		NotesRepository.delete(existingNote);
		return existingNote;
	}
}

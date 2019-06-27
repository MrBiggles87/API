package qa.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}

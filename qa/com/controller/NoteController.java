package qa.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class NoteController {
	
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public list<note> list(){
	

}

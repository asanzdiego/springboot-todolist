package app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String holaMundo() {

		return "Hola Mundo";
	}
}

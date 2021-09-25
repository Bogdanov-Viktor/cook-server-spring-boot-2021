package api.mysql;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
//......временные......
//thymeleaf
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
///

@RestController
public class MeasuresController {
	
	@Autowired
	MeasuresRepository measuresRepo;
	
	//measures.get?id=единица_измер
	@GetMapping("/measures.get")
	String get(@RequestParam("id")Long id) {
		
		//TODO
		
		return "measures.get";
	}
	
}

package api.mysql;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
//......временные......
//thymeleaf
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
///

@RestController
//@RequestMapping("/ingredients")
public class IngredientsController {
	
	@Autowired
	IngredientsRepository ingredientsRepo;
	
	//ingredients.search?dish=id_блюда
	@GetMapping("ingredients.search")
	String search(@RequestParam("dish") Long dish) {
		
		//TODO
		
		return "ingredients.search";
	}
	
}
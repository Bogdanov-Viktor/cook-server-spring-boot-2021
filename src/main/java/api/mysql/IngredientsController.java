package api.mysql;


//POST / ingredients.edit?access_token="9h9er798”
//{ id : 1, dish_id:22, product_id:22, product_amount_in_dish:211}
//Response :       { status : true}
//GET /ingredients.delete?id=2&access_token="9h9er798”
//{ status : true}
//|---------|
//|----?----|
//GET / ingredients.delete?dish=2&access_token="9h9er798”
//{ status : true}
//POST / ingredients.add?access_token="9h9er798”
//[{dish_id:22, product_id:22, product_amount_in_dish:211},
//{ dish_id:22, product_id:22, product_amount_in_dish:211}]
//Response :       { status : true}



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
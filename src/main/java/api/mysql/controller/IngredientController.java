package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;


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


//......запросы......
//POST / ingredient.edit?access_token="9h9er798”
//{ id : 1, dish_id:22, product_id:22, product_amount_in_dish:211}
//Response :       { status : true}
//GET /ingredient.delete?id=2&access_token="9h9er798”
//{ status : true}
//|---------|
//|----?----|
//GET / ingredient.delete?dish=2&access_token="9h9er798”
//{ status : true}
//POST / ingredient.add?access_token="9h9er798”
//[{dish_id:22, product_id:22, product_amount_in_dish:211},
//{ dish_id:22, product_id:22, product_amount_in_dish:211}]
//Response :       { status : true}


@RestController
//@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	IngredientRepository ingredientsRepo;
	
	//ingredient.search?dish=id_блюда
	@GetMapping("ingredient.search")
	String search(@RequestParam("dish") Long dish) {
		
		//TODO
		
		return "ingredients.search";
	}
	
}
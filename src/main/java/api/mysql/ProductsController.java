package api.mysql;

//GET /products.getAll?access_token="9h9er798”
//{ status : true, value : [ { id : 1, name : “Укроп”, measure_id=1, amount=300 }, { id : 2, name : “Укроп”, measure_id=1, amount=300 } ]}
//POST /products.edit?access_token="9h9er798”
//{ id : 1, name : “Укроп”, measure_id=1, amount=300 }
//Response :       { status : true}
//POST /products.add?access_token="9h9er798”
//{ name : “Укроп”, measure_id=1, amount=300 }
//Response :       { status : true}
//
//GET /products.delete?id=2&access_token="9h9er798”
//{ status : true}

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
public class ProductsController {
	
	@Autowired
	ProductsRepository productsRepo;
	
	//products.get?id=продукт
	@GetMapping("/products.get")
	String get(@RequestParam("id") Long id) {
		
		//TODO
		
		return "products.get";
	}
}

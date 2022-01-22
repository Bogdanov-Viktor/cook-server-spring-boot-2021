package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
//......временные......
//thymeleaf
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
///


//GET /product.getAll?access_token="9h9er798”
//{ status : true, value : [ { id : 1, name : “Укроп”, measure_id=1, amount=300 }, { id : 2, name : “Укроп”, measure_id=1, amount=300 } ]}
//POST /product.edit?access_token="9h9er798”
//{ id : 1, name : “Укроп”, measure_id=1, amount=300 }
//Response :       { status : true}
//POST /product.add?access_token="9h9er798”
//{ name : “Укроп”, measure_id=1, amount=300 }
//Response :       { status : true}
//
//GET /product.delete?id=2&access_token="9h9er798”
//{ status : true}


@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;
	
	//GET /product.getAll?access_token="9h9er798”
	//{ status : true, value : [ { id : 1, name : “Укроп”, measure_id=1, amount=300 }, { id : 2, name : “Укроп”, measure_id=1, amount=300 } ]}
	@GetMapping("/product.getAll")
	String getAll(@RequestParam("access_token") String token) {
		
		//TODO
		
		return "product.get";
	}
	
	//POST /product.edit?access_token="9h9er798”
	//{ id : 1, name : “Укроп”, measure_id=1, amount=300 }
	//Response :       { status : true}
	@GetMapping("/product.edit")
	String edit(@RequestParam("access_token") String token) {
		
		//TODO
		
		return "product.get";
	}
	
	//POST /product.add?access_token="9h9er798”
	//{ name : “Укроп”, measure_id=1, amount=300 }
	//Response :       { status : true}
	@GetMapping("/product.add")
	String add(@RequestParam("access_token") String token) {
		
		//TODO
		
		return "product.get";
	}
	
	//GET /product.delete?id=2&access_token="9h9er798”
	//{ status : true}
	@GetMapping("/product.delete")
	String delete(@RequestParam("access_token") long id,
			@RequestParam("access_token") String token) {
		
		//TODO
		
		return "product.get";
	}
}

package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;

//POST /dish.search?access_token="9h9er798”
//Request :       { cook_time:{from : 00:00, to : 3:00}, num_of_people:{from : 0, to : 10}, product_limits : [{id:22, from:0, to : 10},{id:34, from:0, to : 10} ] }
//Response :      { status : true, value : [ { id : 1, name : “лаваш”, cook_time: 1:00, num_of_people:6, recope_id : 21} , { id : 22, name : “лаваш”, cook_time: 1:00, num_of_people:6, recope_id : 21} ]
//
//POST /dish.edit?access_token="9h9er798”
//{ id : 1, name : “лаваш”, cook_time: 1:00, num_of_people:6, recope_id : 21}
//Response :       { status : true}
//POST /dish.add?access_token="9h9er798”
//{ name : “лаваш”, cook_time: 1:00, num_of_people:6, recope_id : 21}
//Response :       { status : true}
//GET /dish.delete?id=2&access_token="9h9er798”
//{ status : true}
//{ status : false}
//{ status : false, menus=[1,2,30]}


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
public class DishController {
	
	@Autowired
	DishRepository dishRepo;
	
	

	//@RequestParam("product") ProductInDishesSearch product, 
	//от-до -- это про кол-во в блюде
	//dish.search?product=id_продукта&productQuaFrom=от&productQuaTo=до&cookTimeTo=до
	@GetMapping("/dish.search")
	Iterable<Dish> search(
			
			@RequestParam(name = "product",required=false) Long product,
			@RequestParam(name = "productQuaFrom",required=false) Integer productQuaFrom,
			@RequestParam(name = "productQuaTo",required=false) Integer productQuaTo,
			
			@RequestParam(name = "cookTimeTo",required=false) Integer cookTimeTo
			
			
			) {
//		String str="";
//		str+=((product!=null)?String.valueOf(product):"null")+" ";
//		str+=((productQuaFrom!=null)?String.valueOf(productQuaFrom):"null")+" ";
//		str+=((productQuaTo!=null)?String.valueOf(productQuaTo):"null")+" ";
//		str+=((cookTimeTo!=null)?String.valueOf(cookTimeTo):"null");
		
		Iterable<Dish> dishesFound = dishRepo.findAll();
		
		//TODO
		
		return dishesFound;
		//нужно: (без поля recipe)
		// [ {"id":1,"name":"qwer","cookTime":"00:00:02","numOfPeople":3},
		// {"id":1,"name":"qwer2","cookTime":"00:00:02","numOfPeople":3} ]
	}
	
	//dish.get?name=название_блюда
	@GetMapping(path="/dish.get", params = {"id"})
	String getById(@RequestParam("id") Long id) {
		
		//TODO
		
		return "dish.get{id}";
		//нужно:
		// {"id":1,"name":"qwer","recipe":"Рецепт","cookTime":"00:00:02","numOfPeople":3}
	}
	
	//dish.get?id=блюдо
	@GetMapping(path="/dish.get", params = {"name"})
	String getByName(@RequestParam("name") String name) {
		
		//TODO
		
		return "dish.get{name}";
		//нужно: (то же самое, что в предидущем)
		// {"id":1,"name":"qwer","recipe":"Рецепт","cookTime":"00:00:02","numOfPeople":3}
	}
	
}

//.................jackson
//           json <-----> object 

//// В этом файле
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;


//// В отдльном файле
//package api.mysql;
//
//public class ProductInDishesSearch {
//	
//	public Long id;
//	public int from;
//	public int to;
//	
////	public ProductInDishesSearch(Long i, int from, int to) {
////		super();
////		this.id = i;
////		this.from = from;
////		this.to = to;
////	}
//	public ProductInDishesSearch() {
//		super();
//	}
//	
//};

////Как метод класса в этом файле
//ProductInDishesSearch productFromJson(String str){
//	ObjectMapper mapper = new ObjectMapper();
//	ProductInDishesSearch product;
//	try {
//		System.out.println("hello ");
//		product = mapper.readValue(str, ProductInDishesSearch.class);
//		System.out.println("Name of animal from JSON string: "+product.from);
//		return product;
//	} catch (JsonMappingException e) {
//		//  Auto-generated catch block
//		//e.printStackTrace();
//	} catch (JsonProcessingException e) {
//		//  Auto-generated catch block
//		//e.printStackTrace();
//	}
//	return null;
//}


//ProductInDishesSearch product2=productFromJson("{ \"id\" : 100, \"from\" : 2, \"to\" : 3 }");
//.................

//import org.springframework.web.bind.annotation.PathVariable;
//@GetMapping("/dishes.get/{id}")
//String getById(@PathVariable("id") Long id) {

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//@RequestMapping(method = RequestMethod.GET, params = {"id", "query"})
//public A getA(@RequestParam int id, @RequestParam String query) {

//@Controller
//public class DishesController {
//	
//	@Autowired
//	Cook2Repository cookRepo;
//	
//	@GetMapping("/")
//	String root(Model model) {
//		System.out.println("rootDir");
//		
//		Iterable<Cook2> cookAll = cookRepo.findAll();
//		
//		model.addAttribute("str","text...");
//		return "hello";
//	}
//}

package api.mysql;

//http://localhost:8080/

//GET /measures.get?id=1&access_token="9h9er798”
//      { status : true, value : { id : 1, name : “т.” } }
//
//Request:    	GET /measures.getAll?access_token="9h9er798”
//Response: 	   { status : true, value : [ { id : 0, name : “кг” },  { id : 1, name : “т.” }] }
//
//GET /measures.delete?id=0&access_token="9h9er798”
//      {status : true}
//      { status : false}
//      { status : false, products=[2,11,12]}
//GET /measures.add?set_name=”гр”&access_token="9h9er798”
//      {status : true, id=2}
//      {status : false}
//GET /measures.edit?id=0&set_name=”грамм”&access_token="9h9er798”
//      {status : true}


import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import java.util.Dictionary;
//import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
//......временные......
//thymeleaf
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
///

//единицы_измер
@RestController
public class MeasuresController {
	
	@Autowired
	MeasuresRepository measuresRepo;
	
	//GET /measures.get?id=1&access_token="9h9er798”
	//  { status : true, value : { id : 1, name : “т.” } }
	@GetMapping("/measures.get")
	Map<String, Object> get(@RequestParam("id")Long id,
			@RequestParam("access_token")String accessToken) {
		//Map<String,String> dictionary = new HashMap<String,String>();
		 //устар: Dictionary<String, Object> response = new Hashtable<String, Object>();
		 //Dictionary<String, Object> response2 = new Hashtable<String, Object>();
		Map<String, Object> response = new HashMap<String, Object>();
		Map<String, Object> responseValue = new HashMap<String, Object>(); 
		
		response.put("status", true); 
		response.put("value", responseValue);
		 
		responseValue.put("id", 1); 
		responseValue.put("name", "кг");
	    //TODO
		
		return response;
	}
	//GET /measures.getAll?access_token="9h9er798”
	//      { status : true, value : [ { id : 0, name : “кг” },  { id : 1, name : “т.” }] }
	@GetMapping("/measures.getAll")
	Map<String, Object> getAll(@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		List<Object> responseValue = new ArrayList<Object>();
		Map<String, Object> responseValueEl1 = new HashMap<String, Object>();
		Map<String, Object> responseValueEl2 = new HashMap<String, Object>();
		response.put("status", true); 
		response.put("value", responseValue);
		
		responseValue.add(responseValueEl1); 
		responseValue.add(responseValueEl2);
		
		responseValueEl1.put("id", 0); 
		responseValueEl1.put("name", "кг");
		
		responseValueEl2.put("id", 1); 
		responseValueEl2.put("name", "т.");
	    //TODO
		
		return response;
	}
	//GET /measures.delete?id=0&access_token="9h9er798”
	//	      {status : true}
	//	      { status : false}
	//	      { status : false, products=[2,11,12]}
	@GetMapping("/measures.delete")
	Map<String, Object> delete(@RequestParam("id")Long id,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true);
		
	    //TODO
		
		return response;
	}
	//GET /measures.add?set_name=”гр”&access_token="9h9er798”
	//	      {status : true, id=2}
	//	      {status : false}
	@GetMapping("/measures.add")
	Map<String, Object> add(@RequestParam("set_name")String newName,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true); 
		response.put("id", 2);

	    //TODO
		
		return response;
	}
	//GET /measures.edit?id=0&set_name=”грамм”&access_token="9h9er798”
	//	      {status : true}
	@GetMapping("/measures.edit")
	Map<String, Object> edit(@RequestParam("id")String id,
			@RequestParam("set_name")String newName,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true);
	    //TODO
		
		return response;
	}
	
}

package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import java.util.Dictionary;
//import java.util.Hashtable;

//......временные......
//thymeleaf
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
///

import org.springframework.beans.factory.annotation.Autowired;


//http://localhost:8080/

//GET /measure.get?id=1&access_token="9h9er798”
//    { status : true, value : { id : 1, name : “т.” } }
//
//Request:    	GET /measure.getAll?access_token="9h9er798”
//Response: 	   { status : true, value : [ { id : 0, name : “кг” },  { id : 1, name : “т.” }] }
//
//GET /measure.delete?id=0&access_token="9h9er798”
//    {status : true}
//    { status : false}
//    { status : false, products=[2,11,12]}
//GET /measure.add?set_name=”гр”&access_token="9h9er798”
//    {status : true, id=2}
//    {status : false}
//GET /measure.edit?id=0&set_name=”грамм”&access_token="9h9er798”
//    {status : true}


//единицы_измер
@RestController
public class MeasureController {

	//private String accessToken="9h9er798";
	
	@Autowired
	MeasureRepository measureRepo;
	
	//http://localhost:8080/measure.get?id=0&access_token=9
	
	//GET /measure.get?id=1&access_token="9h9er798”
	//  { status : true, value : { id : 1, name : “т.” } }
	@GetMapping("/measure.get")
	Map<String, Object> get(@RequestParam("id")long id,
			@RequestParam("access_token")String accessToken) {
		
		
		//Map<String,String> dictionary = new HashMap<String,String>();
		 //устар: Dictionary<String, Object> response = new Hashtable<String, Object>();
		 //Dictionary<String, Object> response2 = new Hashtable<String, Object>();
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true); 
		response.put("value", measureRepo.findAll());
		 
		//TODO
//		responseValue.put("id", 1); 
//		responseValue.put("name", "кг");
		
		return response;
	}
	
	
	//http://localhost:8080/measure.getAll?access_token=9
	
	//GET /measure.getAll?access_token="9h9er798”
	//      { status : true, value : [ { id : 0, name : “кг” },  { id : 1, name : “т.” }] }
	@GetMapping("/measure.getAll")
	Map<String, Object> getAll(@RequestParam("access_token")String accessToken) {
		
//		Map<String, Object> response = new HashMap<String, Object>();
//		List<Object> responseValue = new ArrayList<Object>();
//		Map<String, Object> responseValueEl1 = new HashMap<String, Object>();
//		Map<String, Object> responseValueEl2 = new HashMap<String, Object>();
//		response.put("status", true); 
//		response.put("value", responseValue);
//		
//		responseValue.add(responseValueEl1); 
//		responseValue.add(responseValueEl2);
//		
//		responseValueEl1.put("id", 0); 
//		responseValueEl1.put("name", "кг");
//		
//		responseValueEl2.put("id", 1); 
//		responseValueEl2.put("name", "т.");
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true); 
		response.put("value", measureRepo.findAll());
		
		return response;
	}
	//GET /measure.delete?id=0&access_token="9h9er798”
	//	      {status : true}
	//	      { status : false}
	//	      { status : false, products=[2,11,12]}
	@GetMapping("/measure.delete")
	Map<String, Object> delete(@RequestParam("id")Long id,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true);
		
	    //TODO
		
		return response;
	}
	
	// http://localhost:8080/measure.add?set_name=кг&access_token=9
	
	//GET /measure.add?set_name=”гр”&access_token="9h9er798”
	//	      {status : true, id=2}
	//	      {status : false}
	@GetMapping("/measure.add")
	Map<String, Object> add(@RequestParam("set_name")String newName,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		
		
		response.put("status", true); 
		response.put("id", 2);

		Measure measure = new Measure();
		measure.setName(newName);
		measureRepo.save(measure);
		
		return response;
	}
	//GET /measure.edit?id=0&set_name=”грамм”&access_token="9h9er798”
	//	      {status : true}
	@GetMapping("/measure.edit")
	Map<String, Object> edit(@RequestParam("id")String id,
			@RequestParam("set_name")String newName,
			@RequestParam("access_token")String accessToken) {
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", true);
	    //TODO
		
		return response;
	}
	
}
